package com.senhoresenhora.injesao.notificadores;

import com.senhoresenhora.injesao.clientes.Cliente;
import org.springframework.stereotype.Component;

@Component
public class NotificadorSMS implements Notificador{

    @Override
    public void notificarCliente(Cliente cliente, String mensagem) {
        System.out.println("NOTIFICADOR VIA SMS:"+ mensagem + cliente.getNome());
    }
}
