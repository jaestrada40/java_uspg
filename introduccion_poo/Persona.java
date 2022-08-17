package introduccion_poo;

import java.util.Scanner;

public class Persona {

    /* Atributos */
    private String nombre;
    private String apellido;
    private float dpi;
    private float nit;
    
    /* Constructor */
    public Persona(String nombre, String apellido, float dpi2, float nit2) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dpi = dpi2;
        this.nit = nit2;
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

    public float getDpi() {
        return dpi;
    }

    public void setDpi(float dpi) {
        this.dpi = dpi;
    }

    public float getNit() {
        return nit;
    }

    public void setNit(float nit) {
        this.nit = nit;
    }

    public void ingreseDatos(){
        Scanner entrada = new Scanner(System.in);
        Persona personas[] = new Persona[2];
        for (int i = 0; i < personas.length; i++){
            System.out.println("Ingrese nombre: ");
            nombre = entrada.nextLine();
            System.out.println("Ingrese apellido: ");
            apellido = entrada.nextLine();
            System.out.println("Ingrese DPI: ");
            dpi = entrada.nextFloat();
            System.out.print("Ingrese NIT: ");
            nit = entrada.nextFloat();
            personas[i] = new Persona(nombre, apellido, dpi, nit);
            System.out.println(personas);
        }
    }

    public void imprimirDatos(){
        System.out.println("==================== LISTADO =========================");
        System.out.println("Su nombre es: " + nombre + " " + apellido + " su DPI es " + apellido + " su NIT es " + nit);
    }
}
