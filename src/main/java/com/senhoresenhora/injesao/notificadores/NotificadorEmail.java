package com.senhoresenhora.injesao.notificadores;

import com.senhoresenhora.injesao.clientes.Cliente;
import org.springframework.stereotype.Component;

//@Component
public class NotificadorEmail implements Notificador {

    @Override
    public void notificarCliente(Cliente cliente, String mensagem){
        //Poderia ter uma implementação real de email para notificarmos clientes.
        System.out.println("NOTIFICADOR VIA EMAIL:"+ mensagem + cliente.getNome());
    }
}