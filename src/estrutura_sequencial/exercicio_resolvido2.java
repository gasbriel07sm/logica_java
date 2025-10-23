package estrutura_sequencial;

/* Enunciado:
 * Fazer um programa para ler as medidas da base e altura de um retângulo. Em seguida,
 * mostrar o valor da área, perímetro e diagonal deste retângulo, com quatro casas
 * decimais
 */

import java.util.Locale;
import java.util.Scanner;

public class exercicio_resolvido2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // declaração de variáveis e leitura de dados
        double base = sc.nextDouble();
        double altura = sc.nextDouble();

        // processamento de dados
        double area = base * altura;
        double perimetro = 2.0 * (base + altura);
        double diagonal = Math.sqrt(Math.pow(base, 2.0) + Math.pow(altura, 2.0));

        // saída
        System.out.printf("AREA = %.4f%n", area);
        System.out.printf("PERIMETRO = %.4f%n", perimetro);
        System.out.printf("DIAGONAL = %.4f%n", diagonal);

        sc.close();

    }
}
