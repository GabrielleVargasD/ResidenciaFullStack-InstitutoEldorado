public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente(
                1, "Ana", "ana@email.com", "123456"
        );
        Cliente cliente2 = new Cliente(
                2, "Pedro", "pedro@email.com", "abcdef"
        );

        Produto_Fisico produto1 = new Produto_Fisico(
                1, "Teclado", 150.00, 8, 0.8
        );
        Produto_Digital produto2 = new Produto_Digital(
                2, "Curso de Java", 80.00, 500
        );

        Pedido pedido1 = new Pedido(
                1, cliente1, produto1, 2
        );
        Pedido pedido2 = new Pedido(
                2, cliente2, produto2, 1
        );

        cliente1.exibirDados();
        cliente2.exibirDados();
        System.out.println("\n");

        produto1.exibirDados();
        produto2.exibirDados();
        System.out.println("\n");
        
        pedido1.exibirDados();
        pedido2.exibirDados();
    }
}