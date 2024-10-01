import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        /*
         * Haz un programa Java que lea la base y la altura de un rectángulo y muestre
         * su área y su perímetro.
         */

        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese la base del rectangulo: ");
        double base = input.nextDouble();

        System.out.print("Ingrese la altura del rectangulo: ");
        double altura = input.nextDouble();

        double perimetro, area;

        perimetro = (base * 2) + (altura * 2);
        area = base * altura;

        System.out.println("El perimetro es: " + perimetro + " cm");
        System.out.println("El area es: " + area + " cm2");

        input.close();

    }
}
