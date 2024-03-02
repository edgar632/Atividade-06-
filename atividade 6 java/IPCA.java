import java.util.Scanner;

public class IPCA {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double menor = -1, maior = -1, soma = 0;
        String mesAno, menorMesAno = "", maiorMesAno = "";
        int count = 0;

        System.out.println("Digite os dados do IPCA (ano/mês índice). Para encerrar, digite *:");

        while (true) {
            String entrada = scanner.nextLine();

            if (entrada.equals("*")) {
                break;
            }

            String[] partes = entrada.split(" ");
            mesAno = partes[0];
            double ipcavalor = Double.parseDouble(partes[1].replace(",", "."));

            if (count == 0 || ipcavalor < menor) {
                menor = ipcavalor;
                menorMesAno = mesAno;
            }

            if (count == 0 || ipcavalor > maior) {
                maior = ipcavalor;
                maiorMesAno = mesAno;
            }

            soma += ipcavalor;
            count++;
        }

        if (count > 0) {
            System.out.printf("Menor IPCA: %.2f (Mês/Ano: %s)\n", menor, menorMesAno);
            System.out.printf("Maior IPCA: %.2f (Mês/Ano: %s)\n", maior, maiorMesAno);
            System.out.printf("Média do IPCA: %.2f\n", soma / count);
        } else {
            System.out.println("Nenhum dado fornecido.");
        }

        scanner.close();
    }
}
