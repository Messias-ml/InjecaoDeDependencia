package com.senhoresenhora.injesao.clientes;

import com.senhoresenhora.injesao.notificadores.Notificador;
import org.springframework.stereotype.Service;

@Service
public class AtivarClienteService {

    private final Notificador notificador;

    public AtivarClienteService(Notificador notificador) {
        this.notificador = notificador;
    }

    public void ativarCliente(Cliente cliente){
        notificador.notificarCliente(cliente, "Foi notificado o(a) cliente ");
    }
}
