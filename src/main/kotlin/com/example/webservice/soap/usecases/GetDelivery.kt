package com.example.webservice.soap.usecases

import com.example.webservice.soap.usecases.ports.CorreiosPort
import org.springframework.stereotype.Service

@Service
class GetDelivery(
    private val correiosPort: CorreiosPort
) {
    fun fromCorreio(adminCode: String, searchType: String, requestType: String, deliveryCode: String) =
        correiosPort.getAcompanharPedido(adminCode, searchType, requestType, deliveryCode)
}