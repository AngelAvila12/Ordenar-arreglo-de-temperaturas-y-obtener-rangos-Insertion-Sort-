import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Cuantas temperaturas deseas ingresar? ");
        int n = sc.nextInt();
        double[] temperaturas = new double[n];

        System.out.println("Ingresa las " + n + " temperaturas:");
        for (int i = 0; i < n; i++) {
            temperaturas[i] = sc.nextDouble();
        }

        double[] original = new double[n];
        for (int i = 0; i < n; i++) {
            original[i] = temperaturas[i];
        }

        System.out.println("\nArreglo original:");
        imprimir(original);

        insertionSort(temperaturas);

        System.out.println("\nArreglo ordenado:");
        imprimir(temperaturas);

        double minimo = temperaturas[0];
        double maximo = temperaturas[n - 1];
        double rango = maximo - minimo;

        System.out.println("\n--- Resultados ---");
        System.out.println("Temperatura minima: " + minimo);
        System.out.println("Temperatura maxima: " + maximo);
        System.out.println("Rango (max - min): " + rango);

        System.out.print("3 temperaturas mas altas: ");
        imprimirTopAltas(temperaturas);

        System.out.print("3 temperaturas mas bajas: ");
        imprimirTopBajas(temperaturas);
    }

    public static void insertionSort(double[] arreglo) {
        for (int i = 1; i < arreglo.length; i++) {
            double llave = arreglo[i];
            int j = i - 1;

            while (j >= 0 && arreglo[j] > llave) {
                arreglo[j + 1] = arreglo[j];
                j--;
            }
            arreglo[j + 1] = llave;
        }
    }

    public static void imprimir(double[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }

    public static void imprimirTopAltas(double[] arr) {
        int n = arr.length;

        if (n >= 3) {
            System.out.println(arr[n - 1] + " " + arr[n - 2] + " " + arr[n - 3]);
        } else {
            for (int i = n - 1; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static void imprimirTopBajas(double[] arr) {
        int n = arr.length;

        if (n >= 3) {
            System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);
        } else {
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}