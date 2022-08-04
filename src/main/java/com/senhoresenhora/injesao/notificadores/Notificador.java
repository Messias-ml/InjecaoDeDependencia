package com.senhoresenhora.injesao.notificadores;

import com.senhoresenhora.injesao.clientes.Cliente;

public interface Notificador {

    void notificarCliente(Cliente cliente, String mensagem);
}
