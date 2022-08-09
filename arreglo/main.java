package arreglo;

import java.util.Scanner;

public class main {


    public static void main(String[] args) {

        int array[] = new int[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Ingrese un numero");
            array[i] = sc.nextInt();
        }
        System.out.println("El numero menor es: " + menor(array));

        
    }

    //Metodo para encontrar el menor numero de un arreglo
    public static int menor(int[] array) {
        int menor = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < menor) {
                menor = array[i];
            }
            
        }
        return menor;
    }
}


