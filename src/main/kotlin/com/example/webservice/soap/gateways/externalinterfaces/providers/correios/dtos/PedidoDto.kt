package com.example.webservice.soap.gateways.externalinterfaces.providers.correios.dtos

import com.example.webservice.domains.Pedido
import com.example.webservice.soap.gateways.externalinterfaces.providers.correios.dtos.gen.AcompanharPedidoResponse

class PedidoDto(
    val tipoSolicitacao: String?,
    val codigoAdministrativo: String?,
    val coleta: List<*>,
    val codErro: String?,
    val msgErro: String?,
) {
    companion object {
        fun fromResponse(acompanharPedidoResponse: AcompanharPedidoResponse) = PedidoDto(
            tipoSolicitacao = acompanharPedidoResponse.acompanharPedido.tipoSolicitacao,
            codigoAdministrativo = acompanharPedidoResponse.acompanharPedido.codigoAdministrativo,
            coleta = acompanharPedidoResponse.acompanharPedido.coleta,
            codErro = acompanharPedidoResponse.acompanharPedido.codErro,
            msgErro = acompanharPedidoResponse.acompanharPedido.msgErro,

        )
    }

    fun toDomain() = Pedido(
        tipoSolicitacao = tipoSolicitacao,
        codigoAdministrativo = codigoAdministrativo,
        coleta = coleta,
        codErro = codErro,
        msgErro = msgErro,
    )
}