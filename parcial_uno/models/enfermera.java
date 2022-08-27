package parcial_uno.models;

import javax.swing.JOptionPane;

public class enfermera extends usuario {

    //Atributo especialidad
    private String especialidad;

    //Constructor
    public enfermera(String id, String nombre, String email, String direccion, String telefono, String especialidad) {
        super(id, nombre, email, direccion, telefono);
        this.especialidad = especialidad;
    }

    //getter and setter
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    //arreglo de 10 enfermeras
    public static enfermera[] enfermeras = new enfermera[10];
    public static int contador = 0;

    public static void ingresoEnfermera(){
        //while desea continuar ingresando datos de 10 enfermeras
        while(contador < 10){
            String id = JOptionPane.showInputDialog("Ingrese el id de la enfermera");
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre de la enfermera");
            String email = JOptionPane.showInputDialog("Ingrese el email de la enfermera");
            String direccion = JOptionPane.showInputDialog("Ingrese la direccion de la enfermera");
            String telefono = JOptionPane.showInputDialog("Ingrese el telefono de la enfermera");
            String especialidad = JOptionPane.showInputDialog("Ingrese la especialidad de la enfermera");
            enfermeras[contador] = new enfermera(id, nombre, email, direccion, telefono, especialidad);
            contador++;
            int opcion = JOptionPane.showConfirmDialog(null, "Desea continuar ingresando datos?");
            if(opcion == 1){
                break;
            }
        }
    }

    //mostrar enfermeras
    public static void mostrarEnfermeras(){
        for(int i = 0; i < contador; i++){
            JOptionPane.showMessageDialog(null, " Id: " + enfermeras[i].getId() + "\n Nombre: " + enfermeras[i].getNombre() + "\n Email: " + enfermeras[i].getEmail() + "\n Direccion: " + enfermeras[i].getDireccion() + "\n Telefono: " + enfermeras[i].getTelefono() + "\n Especialidad: " + enfermeras[i].getEspecialidad());
        }
    }
    

    
}
