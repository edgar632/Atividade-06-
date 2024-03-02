#include <stdio.h>
#include <stdlib.h>

int main() {
    char entrada[50];
    double ipcavalor, menor = -1, maior = -1, soma = 0;
    char mes_ano[8], menor_mes_ano[8], maior_mes_ano[8];
    int primeiro = 1, count = 0;

    printf("Digite os dados do IPCA (ano/mês índice). Para encerrar, digite *:\n");

    while (1) {
        fgets(entrada, sizeof(entrada), stdin);

        if (entrada[0] == '*') {
            break;
        }

        sscanf(entrada, "%s %lf", mes_ano, &ipcavalor);

        if (primeiro || ipcavalor < menor) {
            menor = ipcavalor;
            sprintf(menor_mes_ano, "%s", mes_ano);
        }

        if (primeiro || ipcavalor > maior) {
            maior = ipcavalor;
            sprintf(maior_mes_ano, "%s", mes_ano);
        }

        soma += ipcavalor;
        count++;
        primeiro = 0;
    }

    if (count > 0) {
        printf("Menor IPCA: %.2lf (%s)\n", menor, menor_mes_ano);
        printf("Maior IPCA: %.2lf (%s)\n", maior, maior_mes_ano);
        printf("Média do IPCA: %.2lf\n", soma / count);
    } else {
        printf("Nenhum dado fornecido.\n");
    }

    return 0;
}
