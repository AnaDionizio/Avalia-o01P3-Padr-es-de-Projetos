import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Produto p = new Produto();

        System.out.print("Nome: ");
        p.nome = sc.nextLine();

        System.out.print("Preço: ");
        p.preco = sc.nextDouble();

        System.out.print("Quantidade em estoque: ");
        p.quantidade = sc.nextInt();

        System.out.print("Quantidade vendida: ");
        int vendida = sc.nextInt();

        System.out.println("\n--- DADOS DO PRODUTO ---");
        p.exibirAntes();

        if (p.vender(vendida)) {
            p.exibirDepois();
        }

        sc.close();
    }
}