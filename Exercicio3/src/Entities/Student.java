package Entities;

public class Student {

    public String name;
    public double nota1;
    public double nota2;
    public double nota3;

public double total(){

    return nota1 + nota2 + nota3;

    }

public double missingPoints() {

if (total() < 60.0) {

    return 60.0 - total();
} else {
return 0.0;
        }

    }


@Override
public String toString(){

    return name
            +String.format(" nota 1: %.2f ", nota1)
            +String.format("nota 2: %.2f ", nota2)
            +String.format("nota 3: %.2f\n", nota3)
            +String.format("Notal Final: %.2f", total());

}



}
