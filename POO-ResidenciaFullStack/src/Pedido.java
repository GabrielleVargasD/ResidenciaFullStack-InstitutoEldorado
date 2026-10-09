public class Pedido {
    private int id_pedido;
    private Cliente cliente;
    private Produto produto;
    private int quantidade;

    public Pedido(int id_pedido, Cliente cliente, Produto produto, int quantidade) {
        this.id_pedido = id_pedido;
        this.cliente = cliente;
        this.produto = produto;
        this.quantidade = quantidade;
    }
    public void exibirDados() {
        System.out.println("================");
        System.out.println("ID: " + getId());
        System.out.println("Cliente: " + getCliente().getNome());
        System.out.println("Produto: " + getProduto().getNome());
        System.out.println("Quantidade: " + getQuantidade());
    }
    public int getId() {
        return id_pedido;
    }

    public void setId(int id) {
        this.id_pedido = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
