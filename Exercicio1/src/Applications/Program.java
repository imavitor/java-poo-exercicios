package Applications;
import java.util.Scanner;
import Entities.Retangle;
import java.util.Locale;
public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Retangle ret = new Retangle();
        ret = new Retangle();

        System.out.println("Digite o valor do lado e da altura do retangulo: ");

        ret.width = sc.nextDouble();
        ret.height = sc.nextDouble();

        System.out.println(ret);





    }

}
