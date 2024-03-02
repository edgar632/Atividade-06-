import java.util.Scanner;

public class listadechecagem{

    public static void verificarpassageiro(int qtdPassageiros) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < qtdPassageiros; ++i) {
            System.out.print("Possui RG? Digite 'RG' ou 'Nao possui': ");
            String possuiRg = scanner.next();

            if ("Nao possui".equals(possuiRg)) {
                System.out.println("A saída é nessa direção");
                continue;
            }

            System.out.print("Digite a data de nascimento (formato DD/MM/AAAA): ");
            String dataNascRg = scanner.next();

            System.out.print("Possui Passagem? Digite 'Passagem' ou 'Nao possui': ");
            String possuiPassagem = scanner.next();

            if ("Nao possui".equals(possuiPassagem)) {
                System.out.println("A recepção é nessa direção");
                continue;
            }

            System.out.print("Digite a data de nascimento na passagem (formato DD/MM/AAAA): ");
            String dataNascPassagem = scanner.next();

            if (!dataNascRg.equals(dataNascPassagem)) {
                System.out.println("190");
                continue;
            }

            System.out.print("Digite o número do assento (formato A12): ");
            String assento = scanner.next();
            System.out.println("O seu assento é " + assento + ", tenha um ótimo dia");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de passageiros: ");
        int quantidadePassageiros = scanner.nextInt();

        verificarpassageiro(quantidadePassageiros);
    }
}
