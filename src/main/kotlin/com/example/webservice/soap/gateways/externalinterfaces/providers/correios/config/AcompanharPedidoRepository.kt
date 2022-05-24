package com.example.webservice.soap.gateways.externalinterfaces.providers.correios.config

import org.springframework.context.annotation.Configuration
import org.springframework.oxm.jaxb.Jaxb2Marshaller
import org.springframework.ws.client.core.support.WebServiceGatewaySupport

@Configuration
class AcompanharPedidoRepository : WebServiceGatewaySupport() {

    init {
        val marshaller = Jaxb2Marshaller()
        marshaller.contextPath = "com.example.webservice.soap.gateways.externalinterfaces.providers.correios.dtos.gen"

        webServiceTemplate.defaultUri =
            "https://apphom.correios.com.br/logisticaReversaWS/logisticaReversaService/logisticaReversaWS"
        webServiceTemplate.marshaller = marshaller
        webServiceTemplate.unmarshaller = marshaller
    }
}