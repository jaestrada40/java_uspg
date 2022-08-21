package poo;

import javax.swing.JOptionPane;

import poo.models.*;

public class Main {

    public static void main(String[] args) {
        
        int opcion = 0;
        String op = "";
        do{
            op=JOptionPane.showInputDialog("1. Ingresar Persona\n2. Ingresar Alumno\n3. Ingresar Catedratico\n4. Mostrar datos de Personas\n5. Mostrar datos de Alumno\n6. Mostrar datos de Catedratico\n7. Salir");
            opcion = Integer.parseInt(op);
            switch (opcion) {
                case 1:
                Persona.ingresarDatos();
                break;
                case 2:
                Alumno.ingresarAlumno();
                break;
                case 3:
                Catedratico.ingresarCatedratico();
                break;
                case 4:
                Persona.mostrarDatos();
                break;
                case 5:
                Alumno.mostrarAlumnos();
                break;
                case 6:
                Catedratico.mostrarCatedraticos();
                break;
                case 7:
                JOptionPane.showMessageDialog(null, "Gracias por usar el programa");
                break;
                default:
                JOptionPane.showMessageDialog(null, "Opción no válida");
                break;

            }
        }while(opcion!=5);
    }
}

    
