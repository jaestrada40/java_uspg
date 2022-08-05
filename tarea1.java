import java.util.Scanner;

/**
 * tarea1
 */
public class tarea1 {
   

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        menu();
    }

    
    public static void menu() {

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
                arregloAleatorio();
                break;
            case 2:
                arregloAscendente();
                break;
            case 3:
                arregloDescendente();
                break;
            case 4:
                mostrarArreglo();
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

    public static void arregloAleatorio() {
        System.out.println("==== Arreglo aleatorio ====");
        int[] arregloAleatorio = new int[10];
        for (int i = 0; i < arregloAleatorio.length; i++) {
            arregloAleatorio[i] = (int) (Math.random() * 100);
        }
        for (int i = 0; i < arregloAleatorio.length; i++) {
            System.out.println(arregloAleatorio[i]);
        }
    }

    public static void arregloAscendente() {
        System.out.println("==== Arreglo Ascendente ====");
        int[] arregloAscendente = new int[10];
        for (int i = 0; i < arregloAscendente.length; i++) {
            arregloAscendente[i] = (int) (Math.random() * 100);
        }
        for (int i = 0; i < arregloAscendente.length; i++) {
            for (int j = i + 1; j < arregloAscendente.length; j++) {
                if (arregloAscendente[i] > arregloAscendente[j]) {
                    int aux = arregloAscendente[i];
                    arregloAscendente[i] = arregloAscendente[j];
                    arregloAscendente[j] = aux;
                }
            }
        }
        //mostrar array ascendente
        for (int i = 0; i < arregloAscendente.length; i++) {
            System.out.println(arregloAscendente[i]);
        }
    }

    public static void arregloDescendente() {
        System.out.println("==== Arreglo descendente ====");
        int[] arregloDescendente = new int[10];
        for (int i = 0; i < arregloDescendente.length; i++) {
            arregloDescendente[i] = (int) (Math.random() * 100);
        }
        //descending
        for (int i = 0; i < arregloDescendente.length; i++) {
            for (int j = i + 1; j < arregloDescendente.length; j++) {
                if (arregloDescendente[i] < arregloDescendente[j]) {
                    int temp = arregloDescendente[i];
                    arregloDescendente[i] = arregloDescendente[j];
                    arregloDescendente[j] = temp;
                }
            }
        }
        for (int i = 0; i < arregloDescendente.length; i++) {
            System.out.println(arregloDescendente[i]);
        }
    }

    public static void mostrarArreglo() {
        System.out.println("==== Mostrar arreglo ====");
        int[] arregloMostrar = new int[10];
        for (int i = 0; i < arregloMostrar.length; i++) {
            arregloMostrar[i] = (int) (Math.random() * 100);
        }
        for (int i = 0; i < arregloMostrar.length; i++) {
            System.out.println(arregloMostrar[i]);
        }
    }
}