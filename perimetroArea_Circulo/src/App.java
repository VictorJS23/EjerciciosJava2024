import java.util.Scanner;
import java.text.DecimalFormat; // Importar una clase para formatear decimales

public class App {
    public static void main(String[] args) {

        /*
         * Haz un programa Java que lea el radio de una circunferencia y muestre su
         * perímetro y su área.
         */

        DecimalFormat df = new DecimalFormat("#.00"); // De esta forma se representa la cantidad de decimales a mostrar

        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el diametro del circulo: ");

        double diametro = input.nextDouble();

        double perimetro = Math.PI * diametro;

        diametro /= 2;

        double area = Math.PI * Math.pow(2, diametro);

        System.out.print("El perimetro del circulo es de: " + df.format(perimetro) + "\n");

        System.out.print("El area del circulo es de: " + df.format(area));

        input.close();
    }
}

/*
 * Otros metodos para formatear decimales
 * 
 * String.format("%.2f", nombre_variable);
 * 
 * (double)Math.round(nombre_variable * 100d) / 100); --> 2 decimales, para
 * mayores deciamles abria que aumentar la cantidad de ceros en ambas
 * operaciones.
 * 
 * 
 */
