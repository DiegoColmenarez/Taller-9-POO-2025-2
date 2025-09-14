package empleados;

public class Empleado extends Persona {
    protected String departamento;
    public Empleado(String nombre, int edad, String departamento){
        super(nombre, edad);
        this.departamento = departamento;
    }
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Departamento: " + departamento);
    }
}