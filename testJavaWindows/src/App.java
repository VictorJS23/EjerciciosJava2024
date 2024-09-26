
import java.util.Scanner;
// import java.util.Arrays;
// import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {

        Class1 MyClass = new Class1();

        int[] array = new int[11];

        System.out.println("Validacion de numeros de targetas de credito");

        System.out.println("Ingrese los 11 digitos de la targeta ");

        array = MyClass.readArray(array.length);

        System.out.println(MyClass.finalValidateArray(array));

    }

    public static class Class1 {

        public int[] readArray(int num) {
            int[] array = new int[num];

            Scanner input = new Scanner(System.in);

            for (int i = 0; i < array.length; i++) {
                array[i] = input.nextInt();
            }

            input.close();

            return array;
        }

        private int separateNumbers(int number) {
            int aux1 = number % 10;

            number /= 10;

            int aux2 = number % 10;

            int result = aux1 + aux2;

            return result;
        }

        private void reverseArray(int[] array) {
            for (int i = 0; i < array.length / 2; i++) {
                int temp = array[i];
                array[i] = array[array.length - i - 1];
                array[array.length - i - 1] = temp;
            }

        }

        public String finalValidateArray(int[] array) {
            reverseArray(array);
            operationArray(array);

            for (int i = 0; i < array.length; i++) {
                if (array[i] >= 10) {
                    array[i] = separateNumbers(array[i]);
                }
            }

            int validation = sumArray(array);

            String result = (validation % 10 == 0) ? "La targeta es valida" : "La targeta no es valida";

            return result;
        }

        private int sumArray(int[] array) {
            int sum = 0;

            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }

            return sum;
        }

        private int[] operationArray(int[] array) {

            for (int i = 0; i < array.length; i++) {
                if (i % 2 != 0) {
                    array[i] *= 2;
                }
            }

            return array;

        }
    }
}
