public class Main {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        // Criando produtos
        Produto produto1 = new Produto("Produto A", 100.0);
        Produto produto2 = new Produto("Produto B", 150.0);
        Produto produto3 = new Produto("Produto C", 200.0);

        // Adicionando produtos ao carrinho
        carrinho.adicionarProduto(produto1);
        carrinho.adicionarProduto(produto2);
        carrinho.adicionarProduto(produto3);

        // Cliente Novo
        carrinho.setDescontoStrategy(new DescontoClienteNovo());
        System.out.println("Total para Novo Cliente: " + carrinho.calcularTotal());

        // Cliente Regular
        carrinho.setDescontoStrategy(new DescontoClienteRegular());
        System.out.println("Total para Cliente Regular: " + carrinho.calcularTotal());

        // Cliente VIP
        carrinho.setDescontoStrategy(new DescontoClienteVIP());
        System.out.println("Total para Cliente VIP: " + carrinho.calcularTotal());
    }
}
