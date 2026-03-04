package Entities;
import java.lang.Math;
public class Retangle {

    public double width;
    public double height;

    public double Area(){

        return width*height;

    }

    public double Perimeter(){

        return 2*(width+height);

    }

    public double Diagonal(){

        return Math.sqrt(width*width+height*height);

    }

    @Override
    public String toString() {
        return "Dados do Retângulo: \n"

                + String.format("Lado: %.2f\n", width)
                + String.format("Altura: %.2f\n", height)
                + String.format("Área: %.2f\n", Area())
                + String.format("Perimetro: %.2f\n", Perimeter())
                + String.format("Diagonal %.2f\n", Diagonal());
    }
}
