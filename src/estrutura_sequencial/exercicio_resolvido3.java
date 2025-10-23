package estrutura_sequencial;

/* Enunciado:
 * Fazer um programa para ler o nome (apenas uma palavra) e idade de duas pessoas.
 * Ao final mostrar uma mensagem com os nomes e a idade média entre essas pessoas,
 * com uma casa decimal
 */

import java.util.Locale;
import java.util.Scanner;

public class exercicio_resolvido3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // declaração de variáveis e leitura de dados
        String nome1 = sc.next();
        int idade1 = sc.nextInt();
        String nome2 = sc.next();
        int idade2 = sc.nextInt();

        // processamento de dados
        double media = (double) (idade1 + idade2) / 2;

        // saída
        System.out.printf("A idade média de %s e %s é de %.1f anos", nome1, nome2, media);

        sc.close();
    }
}
