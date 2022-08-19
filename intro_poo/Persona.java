package intro_poo;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Persona {
    /* Atributos */
    public String nombre;
    public String apellidos;
    public String dpi;
    public String nit;


    /* Constructor */
    public Persona(String nombre, String apellidos, String dpi, String nit) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dpi = dpi;
        this.nit = nit;
    }

    public Persona() {
    }

    /* getter and setter */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    /* Método Intresar Datos */
    public static Persona[] ingresarDatos() {
        Persona personas[] = new Persona[10];
        for (int i = 0; i < personas.length; i++) {
                String nombre = JOptionPane.showInputDialog("Ingrese el nombre: ");
                String apellidos = JOptionPane.showInputDialog("Ingrese los apellidos: ");
                String dpi = JOptionPane.showInputDialog("Ingrese el dpi: ");
                String nit = JOptionPane.showInputDialog("Ingrese el nit: ");
                personas[i] = new Persona(nombre, apellidos, dpi, nit);
        }
        return personas;
    }
    

    /* Método Imprimir */
    public static void mostrarDatos(Persona[] personas) {
        for (int i = 0; i < personas.length; i++) {
            JOptionPane.showMessageDialog(null, "Nombre: " + personas[i].getNombre() + " Apellidos: "
                    + personas[i].getApellidos() + " DPI: " + personas[i].getDpi() + " NIT: " + personas[i].getNit());
        }
    }
}
