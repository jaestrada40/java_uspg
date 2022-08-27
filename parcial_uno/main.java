package parcial_uno;

import javax.swing.JOptionPane;

import parcial_uno.models.*;

public class main {

    public static void main(String[] args) {
        
        int opcion = 0;
        String op = "";
        do{
            op=JOptionPane.showInputDialog("1. Ingresar Usuario\n2. Ingresar Doctor\n3. Ingresar Paciente\n4. Ingrese Enfermera\n5. Mostrar datos de Usuario\n6. Mostrar Doctor\n7. Mostrar Paciente\n8. Mostrar Enfermera\n9. Salir");
            opcion = Integer.parseInt(op);
            switch (opcion) {
                case 1:
                    usuario.ingresarUsuario();
                break;
                case 2:
                    doctor.ingresarDoctor();
                break;
                case 3:
                    paciente.ingresoPaciente();
                break;
                case 4:
                    enfermera.ingresoEnfermera();
                break;
                case 5:
                    usuario.mostrarUsuarios();
                break;
                case 6:
                    doctor.mostrarDoctores();
                break;
                case 7:
                    paciente.mostrarPacientes();
                break;
                case 8:
                    enfermera.mostrarEnfermeras();
                break;
                case 9:
                JOptionPane.showMessageDialog(null, "Gracias por usar el programa");
                break;
                default:
                JOptionPane.showMessageDialog(null, "Opción no válida");
                break;

            }
        }while(opcion!=8);
    }
    
}
