#include <stdio.h>

int main() {
    int quantidadeJogos;
    printf("Digite a quantidade de jogos vendidos por Catarina: ");
    scanf("%d", &quantidadeJogos);

    double custoPorJogo = 19.90;
    double totalVendas = quantidadeJogos * custoPorJogo;
    double bonus = (quantidadeJogos / 15.0) * 0.08 * totalVendas;
    double salario = 0.5 * totalVendas;
    double totalRecebido = salario + bonus;

    printf("Total de Vendas: %.2f\n", totalVendas);
    printf("Bônus: %.2f\n", bonus);
    printf("Total Recebido: %.2f\n", totalRecebido);

    return 0;
}
