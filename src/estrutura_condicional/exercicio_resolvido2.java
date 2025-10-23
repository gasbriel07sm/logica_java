package estrutura_condicional;

/* Bhaskara */

import java.util.Locale;
import java.util.Scanner;

public class exercicio_resolvido2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        // declaração de variáveis
        double a, b, c, x1, x2, delta;

        // leitura de dados
        System.out.print("Digite o valor de A: ");
        a = sc.nextDouble();
        System.out.print("Digite o valor de B: ");
        b = sc.nextDouble();
        System.out.print("Digite o valor de C: ");
        c = sc.nextDouble();

        // processamento de dados
        delta = Math.pow(b, 2) - (4*a*c);

        // condicionais
        if (delta < 0){
            System.out.println("Não existe raiz de delta negativo.");
        } else {
            // processamento de dados (raízes da equação):
            x1 = (-b + Math.sqrt(delta))/(2*a);
            x2 = (-b - Math.sqrt(delta))/(2*a);

            // saída de dados (raízes da equação):
            System.out.println("RAÍZES DA EQUAÇÃO: ");
            System.out.printf("R1: %.2f %n", x1);
            System.out.printf("R2: %.2f %n", x2);
        }

        sc.close();
    }
}
