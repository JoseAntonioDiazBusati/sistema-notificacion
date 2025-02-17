package org.example

import org.example.Interface.Notificable

class NotificacionPush: Notificable {

    override fun enviarNotificacion(): String {
        return "Push realizado"
    }
}