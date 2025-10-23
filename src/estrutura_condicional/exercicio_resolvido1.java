package estrutura_condicional;

/*Enunciado:
 * Fazer um programa para ler as duas notas que um aluno obteve no primeiro e
 * segundo semestres de uma disciplina anual. Em seguida, mostrar a nota final que o
 * aluno obteve no ano juntamente com um texto explicativo. Caso a nota final do aluno
 * seja inferior a 60.00, mostrar a mensagem "REPROVADO". Todos
 * os valores devem ter uma casa decimal
* */

import java.util.Locale;
import java.util.Scanner;

public class exercicio_resolvido1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // declaração de variáveis
        double nota1, nota2, total;

        // leitura de dados
        System.out.print("Digite a primeira nota: ");
        nota1 = sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
        nota2 = sc.nextDouble();

        // processamento de dados
        total = nota1 + nota2;

        // saída do processamento
        System.out.printf("NOTA FINAL = %.1f %n", total);

        // condicional
        if (total < 60.00){
            System.out.println("REPROVADO");
        }
        sc.close();
    }
}
