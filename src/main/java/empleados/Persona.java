package empleados;

public class Persona {
    protected int edad;
    protected String nombre;
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    public void mostrarDetalles(){
        System.out.println("Nombre: " + nombre + "\nEdad: " + edad);
    }
}