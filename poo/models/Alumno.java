package poo.models;

import javax.swing.JOptionPane;

public class Alumno extends Persona{

    //Atributos
    private String carnet;
    private String email;

    //Constructor
    public Alumno(String nombre, String apellidos, String dpi, String nit) {
        super(nombre, apellidos, dpi, nit);
    }

    public Alumno(String nombre, String apellidos, String dpi, String nit, String carnet, String email) {
        super(nombre, apellidos, dpi, nit);
        this.carnet = carnet;
        this.email = email;
    }

    //getter and setter
    public String getCarnet() {
        return carnet;
    }
    
    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //arreglo de 10 alumnos
    public static Alumno[] alumnos = new Alumno[10];
    public static int contador = 0;

    public static void ingresarAlumno(){
        //while desea continuar ingresando datos de 10 alumnos
        while(contador < 10){
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del alumno");
            String apellidos = JOptionPane.showInputDialog("Ingrese los apellidos del alumno");
            String dpi = JOptionPane.showInputDialog("Ingrese el dpi del alumno");
            String nit = JOptionPane.showInputDialog("Ingrese el nit del alumno");
            String carnet = JOptionPane.showInputDialog("Ingrese el carnet del alumno");
            String email = JOptionPane.showInputDialog("Ingrese el email del alumno");
            alumnos[contador] = new Alumno(nombre, apellidos, dpi, nit);
            alumnos[contador].setCarnet(carnet);
            alumnos[contador].setEmail(email);
            contador++;
            int opcion = JOptionPane.showConfirmDialog(null, "Desea continuar ingresando datos?");
            if(opcion == 1){
                break;
            }
        }
    }

    public static void mostrarAlumnos(){
        for(int i = 0; i < contador; i++){
            JOptionPane.showMessageDialog(null, "Nombre: " + alumnos[i].getNombre() + "\nApellidos: " + alumnos[i].getApellidos() + "\nDPI: " + alumnos[i].getDpi() + "\nNIT: " + alumnos[i].getNit() + "\nCarnet: " + alumnos[i].getCarnet() + "\nEmail: " + alumnos[i].getEmail());   
        }
    }
}
