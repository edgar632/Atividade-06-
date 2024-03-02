#include <stdio.h>
#include <string.h>

void verificar_passageiros(int qtd_passageiros) {
    char possui_rg[20], data_nasc_rg[11];
    char possui_passagem[20], data_nasc_passagem[11], assento[4];

    for (int i = 0; i < qtd_passageiros; ++i) {
        printf("Possui RG? Digite 'RG' ou 'Nao possui': ");
        scanf("%s", possui_rg);

        if (strcmp(possui_rg, "Nao possui") == 0) {
            printf("A saída é nessa direção\n");
            continue;
        }

        printf("Digite a data de nascimento (formato DD/MM/AAAA): ");
        scanf("%s", data_nasc_rg);

        printf("Possui Passagem? Digite 'Passagem' ou 'Nao possui': ");
        scanf("%s", possui_passagem);

        if (strcmp(possui_passagem, "Nao possui") == 0) {
            printf("A recepção é nessa direção\n");
            continue;
        }

        printf("Digite a data de nascimento na passagem (formato DD/MM/AAAA): ");
        scanf("%s", data_nasc_passagem);

        if (strcmp(data_nasc_rg, data_nasc_passagem) != 0) {
            printf("190\n");
            continue;
        }

        printf("Digite o número do assento (formato A12): ");
        scanf("%s", assento);
        printf("O seu assento é %s, tenha um ótimo dia\n", assento);
    }
}

int main() {
    int quantidade_passageiros;

    printf("Digite a quantidade de passageiros: ");
    scanf("%d", &quantidade_passageiros);

    verificar_passageiros(quantidade_passageiros);

    return 0;
}
