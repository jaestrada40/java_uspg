package parcial_uno.models;

import javax.swing.JOptionPane;

public class usuario {

    //Atributos id nombre email direccion telefono

    private String id;
    private String nombre;
    private String email;
    private String direccion;
    private String telefono;

    //Constructor
    public usuario(String id, String nombre, String email, String direccion, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    //getter and setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    //arreglo de 10 usuarios    
    public static usuario[] usuarios = new usuario[10];
    public static int contador = 0;

    public static void ingresarUsuario() {
        //while desea continuar ingresando datos de 10 usuarios
        while (contador < 10) {
            String id = JOptionPane.showInputDialog("Ingrese el id del usuario");
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del usuario");
            String email = JOptionPane.showInputDialog("Ingrese el email del usuario");
            String direccion = JOptionPane.showInputDialog("Ingrese la direccion del usuario");
            String telefono = JOptionPane.showInputDialog("Ingrese el telefono del usuario");
            usuarios[contador] = new usuario(id, nombre, email, direccion, telefono);
            contador++;
            int opcion = JOptionPane.showConfirmDialog(null, "Desea continuar ingresando datos?");
            if (opcion == 1) {
                break;
            }
        }
    }
    
    //mostrar los datos de los usuarios
    public static void mostrarUsuarios(){
        for(int i = 0; i < contador; i++){
            JOptionPane.showMessageDialog(null, "Id: " + usuarios[i].getId() + "\nNombre: " + usuarios[i].getNombre() + "\nEmail: " + usuarios[i].getEmail() + "\nDireccion: " + usuarios[i].getDireccion() + "\nTelefono: " + usuarios[i].getTelefono());
            
        }
    }
    
}
