package Tarea2;

import java.util.Scanner;

public class main {


    public static void main(String[] args) {

        menu();

        
    }

    public static void menu() {
        int[] arreglo = new int[3];
        Scanner scanner = new Scanner(System.in);
        while (true){
        System.out.println("1. Buscar el menor numero");
        System.out.println("2. Contador de vocales");
        System.out.println("3. Validar contraseña");
        System.out.println("4. Promedio");
        System.out.println("5. El Mayor y menor");
        System.out.println("6. Salir");
        System.out.println("Ingrese una opcion: ");
        int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    arreglo =ingreso();
                    imprimir(arreglo);
                    break;
                case 2:
                    ingresoTexto(arreglo);
                    break;
                case 3:
                    contraseña();
                    break;
                case 4:
                    promedio();
                    break;
                case 5:
                    mayorMenor();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
    }


    //Metodo ingreso de datos
    public static int[] ingreso(){
        int array[] = new int[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Ingrese un numero");
            array[i] = sc.nextInt();
        }
        return array;
    }

    //Metodo para imprimir el numero menor
    public static void imprimir(int[] array) {
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

    //Metodo ingresar texto y contar las vocales
    public static void ingresoTexto(int[] array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un texto:");
        String texto = sc.nextLine();
        System.out.println("El numero de vocales es: " + contarvocales(texto));
    }

    //Metodo para contar las vocales de un texto
    public static int contarvocales(String texto) {
        int contador = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == 'a' || texto.charAt(i) == 'e' || texto.charAt(i) == 'i' || texto.charAt(i) == 'o' || texto.charAt(i) == 'u') {
                contador++;
            }
        }
        return contador;
    }

    //Metodo para ingresar un password validación de que sea mayor a 8 caracteres y que no contenga espacios en blanco y que contenga por lo menos dos numeros y contenga letras mayusculas y minusculas
    public static void contraseña() {
        System.out.println("==== Validar contraseña ====");
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una contraseña");
        String contraseña = sc.nextLine();
        if (contraseña.length() > 8 && !contraseña.contains(" ") && contarvocales(contraseña) > 0 && contarNumeros(contraseña) > 1 && mayusculas(contraseña)) {
            System.out.println("Contraseña valida");
        } else {
            System.out.println("Contraseña invalida");
        }
    }

    //Metodo para contar mayusculas
    public static boolean mayusculas(String contraseña) {
        int contador = 0;
        for (int i = 0; i < contraseña.length(); i++) {
            if (contraseña.charAt(i) >= 'A' && contraseña.charAt(i) <= 'Z') {
                contador++;
            }
        }
        if (contador > 0) {
            return true;
        } else {
            return false;
        }
    }

    //Metodo para contar los numeros de un texto
    public static int contarNumeros(String texto) {
        int contador = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) >= '0' && texto.charAt(i) <= '9') {
                contador++;
            }
        }
        return contador;
    }
    
  
    //Metodo imprimir promedio de arreglo de 10 numeros
    public static void promedio() {
        System.out.println("==== Promedio ====");        
        int array[] = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.println(array[i]);
        }
        System.out.println("El promedio es: " + promedio(array));

    }

    //Metodo para calcular el promedio de un arreglo
    public static int promedio(int[] array) {
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma = suma + array[i];
        }
        return suma / array.length;
    }

    //Metodo arreglo de numeros aleatorios y encontrar el numero mayor y menor
    public static void mayorMenor() {
        System.out.println("==== El numero mayor y menor ====");
        int array[] = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.println(array[i]);
        }
        System.out.println("El numero mayor es: " + mayor(array));
        System.out.println("El numero menor es: " + menor(array));
    }

    //Metodo para encontrar el numero mayor de un arreglo
    public static int mayor(int[] array) {
        int mayor = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > mayor) {
                mayor = array[i];
            }
        }
        return mayor;
    }

}


