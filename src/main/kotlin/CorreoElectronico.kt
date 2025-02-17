package org.example

import org.example.Interface.Notificable

class CorreoElectronico: Notificable{

    override fun enviarNotificacion(): String {
        return "Ha recibido un correo nuevo"
    }

}