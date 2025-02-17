package org.example

import org.example.Interface.Notificable

class MensajeTexto:Notificable {

    override fun enviarNotificacion(): String {
        return "Tienes un mensaje"
    }
}