package Entities;

public class Employee {

    public String name;
    public double GrossSalary;
    public double Tax;

    public double NetSalary(){
        return GrossSalary - Tax;
    }

    public void IncreaseSalary(double percentage){

        GrossSalary += GrossSalary * (percentage / 100.0);

    }

    @Override
    public String toString() {
        return "Nome do empregado: "
                + name
                + "\n"
                + String.format("Salário Líquido: %.2f\n", NetSalary());
    }
}
