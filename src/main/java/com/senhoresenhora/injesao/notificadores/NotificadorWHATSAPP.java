package com.senhoresenhora.injesao.notificadores;

import com.senhoresenhora.injesao.clientes.Cliente;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class NotificadorWHATSAPP implements Notificador{

    @Override
    public void notificarCliente(Cliente cliente, String mensagem) {
        System.out.println("NOTIFICADOR VIA WHATSAPP:"+ mensagem + cliente.getNome());
    }
}
