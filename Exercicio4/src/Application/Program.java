package Application;
import util.CurrencyConverter;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        System.out.println("What is the dollar price? ");
        Scanner sc = new Scanner(System.in);
        double dollar = sc.nextDouble();

        System.out.println("How many dollars will be bought? ");
        double dollars = sc.nextDouble();

        System.out.printf("Amount to be paid in reais: %.2f", CurrencyConverter.calculator(dollar,dollars));

        sc.close();

    }

}
