import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el peso en kg: ");
        double peso = input.nextDouble();
        System.out.print("Ingrese la altura en m: ");
        double altura = input.nextDouble();

        double indice = peso / Math.pow(altura, 2);

        if (indice >= 17 && indice <= 18.49) {
            System.out.println("Infrapeso");
        } else if (indice >= 18.5 && indice <= 24.99) {
            System.out.println("Peso Normal");
        } else if (indice >= 25 && indice <= 29.99) {
            System.out.println("Sobrepeso");
        } else if (indice >= 30 && indice <= 34.99) {
            System.out.println("Obesidad");
        } else if (indice >= 35 && indice <= 39.99) {
            System.out.println("Obesidad Severa");
        } else if (indice >= 40) {
            System.out.println("Obesidad Morbida");
        }

        input.close();
    }
}
