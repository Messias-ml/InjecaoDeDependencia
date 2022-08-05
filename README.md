# InjecaoDeDependencia
Injeção de dependência e inversão de controle

<h3>clientes</h3>
Aqui nesta pasta vamos deixar tudo relacionado aos clientes.
<br>**Service:**
>Aqui se localiza o serviço que vai notificar o cliente quando ativarmos ele.
>> temos aqui o metodo de ativarCliente que espera receber um cliente.

<br>**Controller:**
>Aqui vamos escolher um cliente para ativarmos e então passar ele como parametro para o ativarCliente.

<br>**Cliente:**
>Esta é a nossa class de cliente, que diz os atributos que o cliente tem.

<h3>notificadores</h3>
Temos a interface **Notificador** ela é com ela que fazemos a inversão de controle.
Utilizamos os notificadores como base dizendo o que precisa ter (um contrato) e quem implementa essa interface, terá que seguir este contrato.

**Os demais notificadores**<br>
É interessante ressaltarmos que todos implementam a interface notificadores, porém anotamos ele como o bean @Component, e este faz a **INVERSÂO DE CONTROLE**
pois invés de implementarmos um acoplamento forte nessas classes, deixamos a cargo do spring, de maneira que: A class que tiver com o @Component e com a anotation
`@Primary` vai ser vista primeiro pelo spring e será acessada, resolvendo assim, o problema de ambiguidade.

>PROBLEMA DE AMBIGUIDADE:
>> acontece quando temos mais de 1 bean sendo injetado ao mesmo tempo em uma class que espera somente 1 injeção e não varias. (No nosso caso o notificador)

**ATIVAR CLIENTE** 
Veja que interessante na class ativar cliente eu não preciso instanciar a notificação, o proprio spring ja faz essa **INJEÇÂO DE DEPENDENCIAS**
colocando tudo que eu preciso na class.