public class Produto {
    String nome;
    double preco;
    int quantidade;

    void exibirAntes() {
        System.out.println("Produto: " + nome);
        System.out.printf("Preço: R$ %.2f\n", preco);
        System.out.println("Estoque antes da venda: " + quantidade + " unidades");
    }

    boolean vender(int qtdVendida) {
        if (qtdVendida > quantidade) {
            System.out.println("Estoque insuficiente para realizar a venda.");
            return false;
        } else {
            quantidade -= qtdVendida;
            System.out.println("Venda realizada: " + qtdVendida + " unidades");
            return true;
        }
    }

    void exibirDepois() {
        System.out.println("Estoque atualizado: " + quantidade + " unidades");
    }
}
