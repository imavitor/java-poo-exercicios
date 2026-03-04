package Application;
import java.util.Scanner;
import java.util.Locale;
import Entities.Employee;

public class Programa {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee empregado = new Employee();

        System.out.println("Digite o nome do empregado: ");
        empregado.name = sc.nextLine();
        System.out.println("Digite o salario do empregado: ");
        empregado.GrossSalary = sc.nextDouble();
        System.out.println("Digite o imposto: ");
        empregado.Tax = sc.nextDouble();

        System.out.println(empregado);

        System.out.println("Qual porcentagem para aumentar o salário? ");
        double percent = sc.nextDouble();
        empregado.IncreaseSalary(percent);
        System.out.println("Dados atualizados: ");
        System.out.println(empregado);

        sc.close();
    }
}
