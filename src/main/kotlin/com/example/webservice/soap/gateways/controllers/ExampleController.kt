package com.example.webservice.soap.gateways.controllers

import com.example.webservice.soap.gateways.controllers.dtos.PedidoResponseDto
import com.example.webservice.soap.usecases.GetDelivery
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping
class ExampleController(
    val getDelivery: GetDelivery,
) {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    fun getExample(
        @RequestParam("codAdministrativo") adminCode: String,
        @RequestParam("tipoBusca") searchType: String,
        @RequestParam("tipoSolicitacao") requestType: String,
        @RequestParam("deliveryCode") deliveryCode: String,
    ): PedidoResponseDto {
        val delivery = getDelivery.fromCorreio(adminCode, searchType, requestType, deliveryCode)
        return PedidoResponseDto.fromDomain(delivery)
    }

}