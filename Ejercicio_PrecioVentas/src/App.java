import java.util.Scanner;
import java.util.Locale; // Esto funciona para forzar el uso del . en los decimales

public class App {
    public static void main(String[] args) throws Exception {

        /*
         * "Calcular el precio de venta de un producto, si se sabe que este debe tener una ganancia del 30% en relacion al precio de compra"
         */

        // double precioVenta, precioCompra;

        // Scanner entrada = new Scanner(System.in);

        // System.out.println("Ingrese el precio del producto: ");
        // precioCompra = entrada.nextFloat();

        // precioVenta = precioCompra + (precioCompra * 0.30);

        // System.out.println("El precio de venta del producto es de: " + precioVenta);

        // entrada.close();

        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US); // permitir el uso del "." en los decimales

        System.out.print("Ingrese el numero de alumnos en su clase: ");
        int numero = input.nextInt();
        input.nextLine(); // Consumir la nueva línea

        String[] alumnos = new String[numero];

        for (int i = 0; i < alumnos.length; i++) {
            System.out.print("Ingrese el nombre de su estudiante numero " + (i + 1) + " : ");
            alumnos[i] = input.nextLine();
        }

        double[] calificaciones = new double[numero];
        double promedio = 0;

        for (int i = 0; i < calificaciones.length; i++) {
            System.out.print("Ingrese las calificaciones de " + alumnos[i] + " :");
            calificaciones[i] = input.nextDouble();
            promedio += calificaciones[i];
        }

        promedio /= numero;

        System.out.print("El promedio de las calificaciones de todo el grupo de alumnos es de: " + promedio);

        input.close();

    }
}
