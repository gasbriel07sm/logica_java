package estrutura_condicional;

import java.util.Scanner;

public class uri1035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // declaração de variáveis
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        // condicional
        if (B > C && D > A && C+D > A+B && C > 0 && D > 0 && A % 2 == 0) {
            System.out.println("Valores aceitos");
        }
        else {
            System.out.println("Valores nao aceitos");
        }

        sc.close();
    }
}
