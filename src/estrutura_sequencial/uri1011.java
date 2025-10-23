package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class uri1011 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // declaração de variáveis
        double raio, volume;
        double pi = 3.14159;

        // leitura de dados
        raio = sc.nextDouble();

        // processamento de dados
        volume = 4.0 / 3.0 * pi * Math.pow(raio, 3.0);

        // saída
        System.out.printf("VOLUME = %.3f\n", volume);

        sc.close();
    }
}
