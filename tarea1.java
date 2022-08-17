import java.util.Scanner;

/**
 * tarea1
 */
public class tarea1 {
   

    public static void main(String[] args) {

        menu();

    }

    
    public static void menu() {
        int[] arregloAleatorio = new int[10];
        Scanner scanner = new Scanner(System.in);
        while (true){
        System.out.println("1. Arreglo aleatorio");
        System.out.println("2. Arreglo ascendente");
        System.out.println("3. Arreglo descendente");
        System.out.println("4. Mostrar arreglo");
        System.out.println("5. Salir");
        System.out.println("Ingrese una opcion: ");
        int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    arregloAleatorio =arregloAleatorio();
                    imprimirArreglo(arregloAleatorio);
                    break;
                case 2:
                    arregloAscendente(arregloAleatorio);
                    imprimirArreglo(arregloAleatorio);
                    break;
                case 3:
                    arregloDescendente(arregloAleatorio);
                    imprimirArreglo(arregloAleatorio);
                    break;
                case 4:
                    mostrarArreglo();
                    imprimirArreglo(arregloAleatorio);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
    }

    public static int[] arregloAleatorio() {
        System.out.println("==== Arreglo Aleatorio ====");
        int[] arregloAleatorio = new int[10];
        for (int i = 0; i < arregloAleatorio.length; i++) {
            arregloAleatorio[i] = (int) (Math.random() * 100);
        }
        return arregloAleatorio;
    }


    public static void imprimirArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }
    }

    public static int[] arregloAscendente(int[] arreglo){
        System.out.println("==== Arreglo Ascendente ====");
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[i] > arreglo[j]) {
                    int aux = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = aux;
                }
            }
        }
        return arreglo;
    }

    public static int[] arregloDescendente(int[] arreglo) {
        System.out.println("==== Arreglo descendente ====");
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[i] < arreglo[j]) {
                    int temp = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temp;
                }
            }
        }
        return arreglo;
    }

    public static int[] mostrarArreglo() {
        System.out.println("==== Arreglo Aleatorio ====");
        int[] arregloAleatorio = new int[10];
        for (int i = 0; i < arregloAleatorio.length; i++) {
            arregloAleatorio[i] = (int) (Math.random() * 100);
        }
        return arregloAleatorio;
    }
}