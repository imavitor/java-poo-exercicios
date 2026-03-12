package util;

public class CurrencyConverter {

    public static double IOF = 0.06;

    public static double calculator(double dollar, double dollars){

        return (dollar*dollars) + (dollar*dollars)*IOF;

    }

}
