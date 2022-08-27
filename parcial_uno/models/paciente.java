package parcial_uno.models;

import javax.swing.JOptionPane;

public class paciente extends usuario{

    //Atributos cumpleaños peso altura sangre
    private String cumpleaños;
    private String peso;
    private String altura;
    private String sangre;

    //Constructor
    public paciente(String id, String nombre, String email, String direccion, String telefono, String cumpleaños, String peso, String altura, String sangre) {
        super(id, nombre, email, direccion, telefono);
        this.cumpleaños = cumpleaños;
        this.peso = peso;
        this.altura = altura;
        this.sangre = sangre;
    }

    //getter and setter
    public String getCumpleaños() {
        return cumpleaños;
    }
    public void setCumpleaños(String cumpleaños) {
        this.cumpleaños = cumpleaños;
    }
    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }
    
    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getSangre() {
        return sangre;
    }

    public void setSangre(String sangre) {
        this.sangre = sangre;
    }

    //arreglo de 10 
    public static paciente[] pacientes = new paciente[10];
    public static int contador = 0;

    public static void ingresoPaciente(){
        //while desea continuar ingresando datos de 10 doctores
        while(contador < 10){
            String id = JOptionPane.showInputDialog("Ingrese el id del paciente");
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del paciente");
            String email = JOptionPane.showInputDialog("Ingrese el email del paciente");
            String direccion = JOptionPane.showInputDialog("Ingrese la direccion del paciente");
            String telefono = JOptionPane.showInputDialog("Ingrese el telefono del paciente");
            String cumpleaños = JOptionPane.showInputDialog("Ingrese el cumpleaños del paciente");
            String peso = JOptionPane.showInputDialog("Ingrese el peso del paciente");
            String altura = JOptionPane.showInputDialog("Ingrese la altura del paciente");
            String sangre = JOptionPane.showInputDialog("Ingrese la sangre del paciente");
            pacientes[contador] = new paciente(id, nombre, email, direccion, telefono, cumpleaños, peso, altura, sangre);
            contador++;
            int opcion = JOptionPane.showConfirmDialog(null, "Desea continuar ingresando datos?");
            if(opcion == 1){
                break;
            }
        }
    }


    //mostrar pacientes
    public static void mostrarPacientes(){
        for(int i = 0; i < contador; i++){
            JOptionPane.showMessageDialog(null, "Id: " + pacientes[i].getId() + "\nnombre: " + pacientes[i].getNombre() + "\nemail: " + pacientes[i].getEmail() + "\ndireccion: " + pacientes[i].getDireccion() + "\ntelefono: " + pacientes[i].getTelefono() + "\ncumpleaños: " + pacientes[i].getCumpleaños() + "\npeso: " + pacientes[i].getPeso() + "\naltura: " + pacientes[i].getAltura() + "\nsangre: " + pacientes[i].getSangre());
        }
    }
    
}
