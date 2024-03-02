import java.util.Scanner;

public class VendaDeJogos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de jogos vendidos por Catarina: ");
        int quantidadeJogos = scanner.nextInt();

        double custoPorJogo = 19.90;
        double totalVendas = quantidadeJogos * custoPorJogo;
        double bonus = (quantidadeJogos / 15) * 0.08 * totalVendas;
        double salario = 0.5 * totalVendas;
        double totalRecebido = salario + bonus;
        
        System.out.println("Total de Vendas: " + String.format("%.2f", totalVendas));
        System.out.println("Bônus: " + String.format("%.2f", bonus));
        System.out.println("Total Recebido: " + String.format("%.2f", totalRecebido));

        scanner.close();
    }
}
