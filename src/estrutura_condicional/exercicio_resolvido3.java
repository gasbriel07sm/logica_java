package estrutura_condicional;

/* Enunciado:
 * Fazer um programa para ler três números inteiros. Em seguida, mostrar qual o
 * menor dentre os três números lidos. Em caso de empate, mostrar apenas uma vez
*/

import java.util.Scanner;

public class exercicio_resolvido3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // declaração de variáveis
        int num1, num2, num3;

        // leitura de dados
        System.out.print("Digite o primeiro número: ");
        num1 = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        num2 = sc.nextInt();
        System.out.print("Digite o terceiro número: ");
        num3 = sc.nextInt();

        // processamento de dados e saída de dados
        if ((num1 > num2) && (num2 > num3)){
            System.out.printf("MENOR = %d", num3);
        } else if ((num1 > num2) && (num2 < num3)){
            System.out.printf("MENOR = %d", num2);
        } else{
            System.out.printf("MENOR = %d", num1);
        }

        sc.close();
    }
}
