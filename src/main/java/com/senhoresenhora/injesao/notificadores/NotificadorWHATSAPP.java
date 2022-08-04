package com.senhoresenhora.injesao.notificadores;

import com.senhoresenhora.injesao.clientes.Cliente;

public class NotificadorWHATSAPP implements Notificador{

    @Override
    public void notificarCliente(Cliente cliente, String mensagem) {
        System.out.println("NOTIFICADOR VIA WHATSAPP:"+ mensagem + cliente.getNome());
    }
}
