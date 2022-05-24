package com.example.webservice.soap.config

import org.springframework.context.annotation.Configuration
import org.springframework.ws.WebServiceMessage
import org.springframework.ws.client.core.WebServiceMessageCallback
import org.springframework.ws.soap.saaj.SaajSoapMessage
import java.util.*
import javax.xml.soap.MimeHeaders

@Configuration
class CorreiosConfig(
    val correiosAuth: CorreiosSoapRequestHeader = CorreiosSoapRequestHeader()
)

class CorreiosSoapRequestHeader : WebServiceMessageCallback {
    private val username = "empresacws"
    private val password = "123456"

    override fun doWithMessage(message: WebServiceMessage) {
        if (message is SaajSoapMessage) {
            val mimeHeader: MimeHeaders = message.saajMessage.mimeHeaders
            mimeHeader.setHeader("Authorization", getB64Auth(username, password))
        }
    }

    private fun getB64Auth(username: String, password: String) = "Basic " + Base64.getUrlEncoder()
        .encodeToString("$username:$password".toByteArray())
}