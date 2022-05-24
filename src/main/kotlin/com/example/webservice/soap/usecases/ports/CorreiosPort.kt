package com.example.webservice.soap.usecases.ports

import com.example.webservice.soap.domains.Pedido

interface CorreiosPort {
    fun getAcompanharPedido(adminCode: String, searchType: String, requestType: String, deliveryCode: String): Pedido
}