package intro_poo;

import java.util.Scanner;

import javax.swing.JOptionPane;


public class Main {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion = 0;
        String op = "";

        do{
            op=JOptionPane.showInputDialog("1. Ingresar datos de personas\n2. Mostrar datos de personas\n3. Salir");
            opcion = Integer.parseInt(op);
            switch (opcion) {
                case 1:
                    Persona.ingresarDatos();
                    break;
                case 2:
                    //Persona ops = new Persona();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
                    break;
            }
        }while(opcion!=3);

    }

}
