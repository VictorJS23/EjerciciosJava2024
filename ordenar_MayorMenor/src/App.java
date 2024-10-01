
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] array = new int[3];

        System.out.println("Inserte tres números: ");

        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }

        // Ordenamiento burbuja

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int aux = array[i];
                    array[i] = array[j];
                    array[j] = aux;
                }
            }
        }

        System.out.println(" ");

        System.out.println("Los números ordenados son: ");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " , ");
        }

        input.close();
    }
}
