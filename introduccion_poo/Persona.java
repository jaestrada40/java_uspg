package introduccion_poo;

import java.util.Scanner;

public class Persona {

    /* Atributos */
    private String nombre;
    private String apellido;
    private int dpi;
    private int nit;

    Scanner entrada = new Scanner(System.in);
    
    /* Constructor */
    public Persona(String nombre, String apellido, int dpi, int nit) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dpi = dpi;
        this.nit = nit;
    }

    /* Getters and Setters */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDpi() {
        return dpi;
    }

    public void setDpi(int dpi) {
        this.dpi = dpi;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public void ingreseDatos(){

        Persona personas[] = new Persona[2];

        for (int i = 0; i < 2; i++ ){

            System.out.println("Ingresar nombre: ");
            nombre = entrada.nextLine();
            System.out.println("Ingrese apellido: ");
            apellido = entrada.nextLine();
            System.out.println("Ingrese DPI: ");
            dpi = entrada.nextInt();
            System.out.println("Ingrese NIT: ");
            nit = entrada.nextInt();
            personas[i] = new Persona(nombre, apellido, dpi, nit);

        }
        for (int i = 0; i < personas.length; i++){
            personas[i].imprimirDatos();
        }
    }

    public void imprimirDatos(){
        System.out.println("Su nombre es: " + nombre + " " + apellido + " su DPI es " + dpi + " su NIT es " + nit);
    }
}
