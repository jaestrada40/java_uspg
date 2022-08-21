package poo.models;

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
         //while desea continuar ingresando datos de 10 personas
         while(contador < 10){
             String nombre = JOptionPane.showInputDialog("Ingrese el nombre");
             String apellidos = JOptionPane.showInputDialog("Ingrese los apellidos");
             String dpi = JOptionPane.showInputDialog("Ingrese el dpi");
             String nit = JOptionPane.showInputDialog("Ingrese el nit");
             Persona persona = new Persona(nombre, apellidos, dpi, nit);
             personas[contador] = persona;
             contador++;
             int opcion = JOptionPane.showConfirmDialog(null, "Desea continuar ingresando datos?");
             if(opcion == 1){
                 break;
             }
         }
     }
 
     public static void mostrarDatos(){
         for (int i = 0; i < contador; i++) {
             JOptionPane.showMessageDialog(null, "Nombre: "+personas[i].getNombre()+"\nApellidos: "+personas[i].getApellidos()+"\nDPI: "+personas[i].getDpi()+"\nNIT: "+personas[i].getNit());
         }
     }
    
}
