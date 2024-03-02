#include <stdio.h>
#include <math.h>

double calcularPi(int n) {
    double resultadoSerie = 0.0;

    for (int i = 0; i < n; i++) {
        double termo = pow(-1, i) * (1.0 / pow(2 * i + 1, 3));
        resultadoSerie += termo;
    }

    double piAproximado = pow(resultadoSerie * 32, 1.0 / 3);
    return piAproximado;
}

int main() {
    int n;

    printf("Digite a quantidade de termos para calcular uma estimativa de pi: ");
    scanf("%d", &n);

    double valorPi = calcularPi(n);
    printf("A estimativa de pi com %d termos é: %.10f\n", n, valorPi);

    return 0;
}
