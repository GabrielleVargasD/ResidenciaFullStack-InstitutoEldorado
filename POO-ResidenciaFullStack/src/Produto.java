public class Produto {
    private int id_prod;
    private String nome = "";
    private double preco;

    public Produto(int id_prod, String nome, double preco) {
        this.id_prod = id_prod;
        this.nome = nome;
        this.preco = preco;
    }

    public void exibirDados() {
        System.out.println("================");
        System.out.println("ID: " + getId_prod());
        System.out.println("Nome: " + getNome());
        System.out.println("Preço: " + getPreco());
    }

    public int getId_prod() {
        return id_prod;
    }

    public void setId_prod(int id_prod) {
        this.id_prod = id_prod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

}
