# TAREFA 1 – Programação Orientada a Objetos
Enunciado: “uma aplicação Java simples de gerenciamento de produtos, clientes ou pedidos utilizando POO. Deve possuir pelo menos 3 classes relacionadas; utilizar encapsulamento; aplicar pelo menos um exemplo de herança ou composição; o código deve possuir responsabilidades bem definidas.”

**Estrutura**: 
- Classe Cliente, Pedido, Produto, Produto_Digital e Produto_Fisico

**Classes relacionadas:**
- Pedido relaciona Cliente com produto
- Produto é classe mãe de Produto_Digital e Produto_Fisico

**Encapsulamento:**
- Private nos atributos de cada classe, para acessar e mudar esses atributos usamos os métodos get e set de cada classe

**Responsabilidades de cada classe:**
- Cliente = Cria a entidade Cliente
- Produto = Cria a entidade Produto e atribuí as características gerais de TODO produto
- Produto_Digital = Classe filha de Produto, tem todas as características gerais e algumas específicas para produtos digitais
- Produto_Fisico = Classe filha de Produto, tem todas as características gerais e algumas específicas para produtos físicos
- Pedido = Cria a entidade pedido que serve como ponte de conexão entre o cliente e o produto. 
