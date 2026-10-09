public class Produto_Digital extends Produto {

    private double tamanhoArquivo;

    public Produto_Digital(int id_prod, String nome, double preco, double tamanhoArquivo) {
        super(id_prod, nome, preco);
        this.tamanhoArquivo = tamanhoArquivo;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Tamanho do arquivo: " + getTamanhoArquivo());
    }

    public double getTamanhoArquivo() {
        return tamanhoArquivo;
    }

    public void setTamanhoArquivo(double tamanhoArquivo) {
        this.tamanhoArquivo = tamanhoArquivo;
    }
}