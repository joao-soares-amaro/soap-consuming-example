package com.example.webservice.soap.domains

data class Pedido(
    val tipoSolicitacao: String?,
    val codigoAdministrativo: String?,
    val coleta: List<*>,
    val codErro: String?,
    val msgErro: String?,
)