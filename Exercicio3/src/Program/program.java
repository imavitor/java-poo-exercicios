package Program;
import java.util.Locale;
import java.util.Scanner;

import Entities.Student;
public class program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Student aluno = new Student();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        aluno.name = sc.nextLine();

        System.out.println("Digite as 3 notas dos alunos");
        aluno.nota1 = sc.nextDouble();
        aluno.nota2 = sc.nextDouble();
        aluno.nota3 = sc.nextDouble();

        System.out.println(aluno);

        if (aluno.total() < 60.0) {
            System.out.println("Reprovado");
            System.out.printf("Faltam:  %.2f pontos\n", aluno.missingPoints());
        }
        else {
            System.out.println("Aprovado");
        }

        sc.close();

    }

}
