package arreglo;

import java.util.Scanner;

public class main {


    public static void main(String[] args) {

        int otrosNumeros[] = {13, 12, 5, 12, 33, 11, 43};
        int menor = otrosNumeros[0];//Suponemos que el menor es el primero
        // Ciclo comienza en 1 porque el 0 ya está contemplado
        for (int x = 1; x < otrosNumeros.length; x++) {
            int numeroActual = otrosNumeros[x];
            if (numeroActual < menor) {
                menor = numeroActual;
            }
        }
        System.out.printf("\nMenor: %d", menor);

        
    }



    
}


