package poo.models;

import javax.swing.JOptionPane;

public class Catedratico extends Persona {

    //Atributos
    private String codigo;
    private String email;

    //Constructor
    public Catedratico(String nombre, String apellidos, String dpi, String nit) {
        super(nombre, apellidos, dpi, nit);
    }

    //getter and setter
    public String getCodigo() {
        return codigo;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //arreglo de 10 catedraticos
    public static Catedratico[] catedraticos = new Catedratico[10];
    public static int contador = 0;

    public static void ingresarCatedratico(){
        //while desea continuar ingresando datos de 10 catedraticos
        while(contador < 10){
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del catedratico");
            String apellidos = JOptionPane.showInputDialog("Ingrese los apellidos del catedratico");
            String dpi = JOptionPane.showInputDialog("Ingrese el dpi del catedratico");
            String nit = JOptionPane.showInputDialog("Ingrese el nit del catedratico");
            String codigo = JOptionPane.showInputDialog("Ingrese el codigo del catedratico");
            String email = JOptionPane.showInputDialog("Ingrese el email del catedratico");
            catedraticos[contador] = new Catedratico(nombre, apellidos, dpi, nit);
            catedraticos[contador].setCodigo(codigo);
            catedraticos[contador].setEmail(email);
            contador++;
            int opcion = JOptionPane.showConfirmDialog(null, "Desea continuar ingresando datos?");
            if(opcion == 1){
                break;
            }
        }
    }

    
    public static void mostrarCatedraticos(){
        for(int i = 0; i < contador; i++){
            JOptionPane.showMessageDialog(null, "Nombre: " + catedraticos[i].getNombre() + "\nApellidos: " + catedraticos[i].getApellidos() + "\nDPI: " + catedraticos[i].getDpi() + "\nNIT: " + catedraticos[i].getNit() + "\nCodigo: " + catedraticos[i].getCodigo() + "\nEmail: " + catedraticos[i].getEmail());   
        }
    }

    
}
