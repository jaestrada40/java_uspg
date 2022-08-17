package introduccion_poo;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        String nombre = "";
        String apellido ="";
        int dpi = 0;
        int nit = 0;
        Persona personas = new Persona(nombre, apellido, dpi, nit);

        Scanner scanner = new Scanner(System.in);
        while (true){

        System.out.println("1. Ingresar datos persona");
        System.out.println("2. Mostrar datos persona");
        System.out.println("3. Salir");
        System.out.println("Ingrese una opcion: ");
        int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    personas.ingreseDatos();
                    break;
                case 2:
                    personas.imprimirDatos();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }

    }

}
