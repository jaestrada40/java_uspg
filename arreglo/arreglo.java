package arreglo;

import java.util.Scanner;

public class arreglo {

    public static void main(String[] args) {
        /*int[] marks = {22,66,33,99,88,77};
        display(marks);

        int[] revmarks;
        revmarks = reverseArray(marks);
        System.out.println("Reverse array elements");
        display(revmarks);*/
        int[] arregloAleatorio = new int[10];
        for (int i = 0; i < arregloAleatorio.length; i++) {
            arregloAleatorio[i] = (int) (Math.random() * 10);
        }
        menu(arregloAleatorio);

    }

    /*public static void display(int[] input){
        for (int counter   = 0; counter < input.length; counter ++){
            System.out.println(input[counter]);
        }
    }

    public static int[] reverseArray(int[] input){
        int[] reverse = new int[input.length];
        for (int i = 0, j = reverse.length -1; i < input.length; i++,j--){
            reverse[j] = input[i];
        }
        return reverse;
    }*/
    public static void menu(int[] arregloAleatorio) {

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
                    arregloAleatorio(arregloAleatorio);
                    imprimir(arregloAleatorio);
                    break;
                case 2:
                    arregloAscendente(arregloAleatorio);
                    break;
                case 3:
                    //arregloDescendente();
                    break;
                case 4:
                    //mostrarArreglo();
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

    public static void arregloAleatorio(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    
    public static void arregloAscendente(int[] arr ){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int aux = arr[i];
                    arr[i] = arr[j];
                    arr[j] = aux;
                }
            }
        }
    }

    public static void imprimir(int[] arr){
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
