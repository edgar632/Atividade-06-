import java.util.Scanner;

public class Pi {
    public static double calcularPi(int n) {
        double resultadoSerie = 0.0;

        for (int i = 0; i < n; i++) {
            double termo = Math.pow(-1, i) * (1.0 / Math.pow(2 * i + 1, 3));
            resultadoSerie += termo;
        }

        double piAproximado = Math.pow(resultadoSerie * 32, 1.0 / 3);
        return piAproximado;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de termos para calcular pi: ");
        int n = scanner.nextInt();

        double valorPi = calcularPi(n);
        System.out.printf("%.10f\n", valorPi);
    }
}
