package estrutura_sequencial;

import java.util.Scanner;

public class uri1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // declaração de variáveis
        int N, resto, horas, minutos, segundos;

        // leitura de dados
        N = sc.nextInt();

        // processamento de dados
        horas = N / 3600;
        resto = N % 3600;
        minutos = resto / 60;
        segundos = resto % 60;

        // saída
        System.out.println(horas + ":" + minutos + ":" + segundos);

        sc.close();
    }
}
