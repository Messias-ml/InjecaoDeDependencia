package com.senhoresenhora.injesao.clientes;

import com.senhoresenhora.injesao.notificadores.Notificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class AtivarClienteService {

    @Qualifier("rapido")
    @Autowired
    private Notificador notificador;

    public void ativarCliente(Cliente cliente){
        cliente.setAtivo(true);
        notificador.notificarCliente(cliente, "Foi notificado o(a) cliente ");
    }
}
