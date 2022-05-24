package com.example.webservice.soap.gateways.controllers.dtos

import com.example.webservice.domains.Pedido

data class PedidoResponseDto(
    val tipoSolicitacao: String?,
    val codigoAdministrativo: String?,
    val coleta: List<*>,
    val codErro: String?,
    val msgErro: String?,
) {
    companion object {
        fun fromDomain(pedido: Pedido) = PedidoResponseDto(
            tipoSolicitacao = pedido.tipoSolicitacao,
            codigoAdministrativo = pedido.codigoAdministrativo,
            coleta = pedido.coleta,
            codErro = pedido.codErro,
            msgErro = pedido.msgErro,
        )
    }
}