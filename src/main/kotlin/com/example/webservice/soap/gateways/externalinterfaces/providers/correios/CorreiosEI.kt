package com.example.webservice.soap.gateways.externalinterfaces.providers.correios

import com.example.webservice.soap.domains.Pedido
import com.example.webservice.soap.config.CorreiosSoapRequestHeader
import com.example.webservice.soap.gateways.externalinterfaces.providers.correios.config.AcompanharPedidoRepository
import com.example.webservice.soap.gateways.externalinterfaces.providers.correios.dtos.PedidoDto
import com.example.webservice.soap.gateways.externalinterfaces.providers.correios.dtos.gen.AcompanharPedido
import com.example.webservice.soap.gateways.externalinterfaces.providers.correios.dtos.gen.AcompanharPedidoResponse
import com.example.webservice.soap.gateways.externalinterfaces.providers.correios.dtos.gen.ObjectFactory
import com.example.webservice.soap.usecases.ports.CorreiosPort
import org.springframework.stereotype.Repository
import javax.xml.bind.JAXBElement

@Repository
class CorreiosEI(
    val acompanharPedidoRepository: AcompanharPedidoRepository
) : CorreiosPort {

    override fun getAcompanharPedido(
        adminCode: String, searchType: String, requestType: String, deliveryCode: String
    ): Pedido {
        val objectFactory = ObjectFactory()

        // request body
        val acompanharPedido = objectFactory.createAcompanharPedido()
            .apply {
                this.codAdministrativo = adminCode
                this.tipoBusca = searchType
                this.tipoSolicitacao = requestType
                this.numeroPedido.add(deliveryCode)
            }
        val request: JAXBElement<AcompanharPedido> = objectFactory.createAcompanharPedido(acompanharPedido)

        // make the request and get the response
        val acompanharPedidoResponse = (acompanharPedidoRepository.webServiceTemplate.marshalSendAndReceive(
            request, CorreiosSoapRequestHeader()
        ) as JAXBElement<AcompanharPedidoResponse>).value

        return PedidoDto.fromResponse(acompanharPedidoResponse)
            .toDomain()
    }
}
