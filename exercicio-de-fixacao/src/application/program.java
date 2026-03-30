package application;
import java.util.Locale;
import java.util.Scanner;
import entities.Account;

public class program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        System.out.print("Enter account Holder: ");
        String holder = sc.next();
        double balance = 0;
        System.out.println("Is there an initial deposit (y/n)?");
        String answer = sc.next();
        if (answer.equalsIgnoreCase("y")) {
            System.out.print("Enter account balance: ");
            balance = sc.nextDouble();
        }

        Account account = new Account(number, holder, balance);
        System.out.println(account);

        System.out.println("Enter a deposit value: ");
        double deposit = sc.nextDouble();
        account.deposit(deposit);

        System.out.println("Updated account data: ");
        System.out.println(account);

        System.out.println("Enter a withdraw value: ");
        double withdraw = sc.nextDouble();
        account.withdraw(withdraw);

        System.out.println("Updated account data: ");
        System.out.println(account);


    }

}
