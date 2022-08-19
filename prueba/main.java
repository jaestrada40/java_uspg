package prueba;

import java.util.Scanner;
import prueba.Estudiante;

public class main {
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        String nombre, apellido;
        int edad;
        Estudiante group[] = new Estudiante[2];

        for (int i = 0; i < 2; i++){
            System.out.print("Ingrese nombre: ");
            nombre = entrada.nextLine();
            System.out.print("Ingrese apellido: ");
            apellido = entrada.nextLine();
            System.out.print("Ingrese edad: ");
            edad = entrada.nextInt();
            group[i] = new Estudiante(nombre,apellido,edad);
        }
        for(int i =0; i < 2; i++)
            group[i].imprimirEstudiante();
        
    }
}
