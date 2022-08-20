package intro_poo;

import javax.swing.JOptionPane;

public class Persona {
    /* Atributos */
    private String nombre;
    private String apellidos;
    private String dpi;
    private String nit;


    /* Constructor */
    public Persona(String nombre, String apellidos, String dpi, String nit) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dpi = dpi;
        this.nit = nit;
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
    
    //arreglo de 10 personas
    public static Persona[] personas = new Persona[10];
    public static int contador = 0;

    public static void ingresarDatos(){
        for (int i = 0; i < personas.length; i++) {
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre de la persona");
            String apellidos = JOptionPane.showInputDialog("Ingrese los apellidos de la persona");
            String dpi = JOptionPane.showInputDialog("Ingrese el dpi de la persona");
            String nit = JOptionPane.showInputDialog("Ingrese el nit de la persona");
            Persona persona = new Persona(nombre, apellidos, dpi, nit);
            personas[i] = persona;
            contador++;
        }
        
    }

    public static void mostrarDatos(){
        for (int i = 0; i < contador; i++) {
            JOptionPane.showMessageDialog(null, "Nombre: "+personas[i].getNombre()+"\nApellidos: "+personas[i].getApellidos()+"\nDPI: "+personas[i].getDpi()+"\nNIT: "+personas[i].getNit());
        }
    }

    
    

}

