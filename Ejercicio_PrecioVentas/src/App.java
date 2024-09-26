import java.util.Scanner;

/*
 * "Calcular el precio de venta de un producto, si se sabe que este debe tener una ganancia del 30% en relacion al precio de compra"
 */

public class App {
    public static void main(String[] args) throws Exception {

        double precioVenta, precioCompra;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el precio del producto: ");
        precioCompra = entrada.nextFloat();

        precioVenta = precioCompra + (precioCompra * 0.30);

        System.out.println("El precio de venta del producto es de: " + precioVenta);

        entrada.close();

    }
}
