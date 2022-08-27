package parcial_uno.models;

import javax.swing.JOptionPane;

public class doctor extends usuario {
    
    //Atributos id nombre email direccion telefono
    
    private String especialidad;
    
    //Constructor
    public doctor(String id, String nombre, String email, String direccion, String telefono, String especialidad) {
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
    
    //arreglo de 10 doctores
    public static doctor[] doctores = new doctor[10];
    public static int contador = 0;
    
    public static void ingresarDoctor(){
        //while desea continuar ingresando datos de 10 doctores
        while(contador < 10){
            String id = JOptionPane.showInputDialog("Ingrese el id del doctor");
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del doctor");
            String email = JOptionPane.showInputDialog("Ingrese el email del doctor");
            String direccion = JOptionPane.showInputDialog("Ingrese la direccion del doctor");
            String telefono = JOptionPane.showInputDialog("Ingrese el telefono del doctor");
            String especialidad = JOptionPane.showInputDialog("Ingrese la especialidad del doctor");
            doctores[contador] = new doctor(id, nombre, email, direccion, telefono, especialidad);
            contador++;
            int opcion = JOptionPane.showConfirmDialog(null, "Desea continuar ingresando datos?");
            if(opcion == 1){
                break;
            }
        }
    }

    //mostrar doctores
    public static void mostrarDoctores(){
        for(int i = 0; i < contador; i++){
            JOptionPane.showMessageDialog(null, " Id: " + doctores[i].getId() + "\n Nombre: " + doctores[i].getNombre() + "\n Email: " + doctores[i].getEmail() + "\n Direccion: " + doctores[i].getDireccion() + "\n Telefono: " + doctores[i].getTelefono() + "\n Especialidad: " + doctores[i].getEspecialidad());
        }
    }

}
