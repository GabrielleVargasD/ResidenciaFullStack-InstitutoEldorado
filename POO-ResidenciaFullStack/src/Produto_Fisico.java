public class Produto_Fisico extends Produto {
    private double peso;
    private int estoque;

    public Produto_Fisico(int id_prod, String nome, double preco, int estoque, double peso) {
        super(id_prod, nome, preco);
        this.peso = peso;
        this.estoque = estoque;
    }
    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Peso: " + getPeso() + " kg");
        System.out.println("Estoque: " + getEstoque());
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
}