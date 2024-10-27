import java.util.*;

public class App {
    public static void main(String[] args) {
        System.out.println("Ingrese la numeracion del codigo de barras a procesar");

        Scanner sc = new Scanner(System.in);

        String code = sc.nextLine();

        ArrayList<Integer> lista = new ArrayList<>();

        for (int i = 0; i < code.length(); i++) {
            if (code.charAt(i) != '0') {
                lista.add(Integer.parseInt(String.valueOf(code.charAt(i))));
            } else {
                break;
            }
        }

        // Validar si el codigo de barras es de tipo EAN-13 o EAN-8

        boolean flag = (lista.size() >= 8) ? true : false;

        if (flag) {
            int sumaImp = 0;
            int sumaPar = 0;

            for (int i = lista.size() - 1; i >= 0; i--) {
                if (i % 2 == 0) {
                    sumaPar += lista.get(i);
                } else {
                    sumaImp += lista.get(i);
                }
            }

            int sumaTotal = sumaImp * 3 + sumaPar;

            int digitoControl = 100 - sumaTotal;

            lista.add(digitoControl);

            for (int i = 0; i < lista.size(); i++) {
                System.out.print(lista.get(i) + " - ");
            }
        } else {
            int sumaPar = 0;
            int sumaImp = 0;

            for (int i = lista.size() - 1; i >= 0; i--) {
                if (i % 2 == 0) {
                    sumaImp += lista.get(i) * 3;
                } else {
                    sumaPar += lista.get(i);
                }
            }

            int sumaTotal = sumaImp + sumaPar;

            if (sumaTotal % 10 == 0) {
                int digitoControl = 0;
                lista.add(digitoControl);
            } else {
                int count = 1;
                while (sumaTotal % 10 != 0) {
                    sumaTotal += count;
                    count++;
                }
                int digitoControl = count;
                lista.add(digitoControl);
            }

        }

        sc.close();

    }
}
