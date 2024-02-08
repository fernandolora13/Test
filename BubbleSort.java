public class BubbleSort {
    public static void main(String[] args) {
        int[] arreglo = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Arreglo antes del ordenamiento:");
        imprimirArreglo(arreglo);

        ordenamientoBurbuja(arreglo);

        System.out.println("\nArreglo después del ordenamiento:");
        imprimirArreglo(arreglo);
    }

    static void ordenamientoBurbuja(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Compara elementos adyacentes
                if (arr[j] > arr[j + 1]) {
                    // Intercambia los elementos si están en el orden incorrecto
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    static void imprimirArreglo(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
