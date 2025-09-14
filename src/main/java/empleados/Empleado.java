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

    public static void main(String[] args) {
        var individuo = new Persona("Jose", 53);
        var personal = new Empleado("Luis", 45, "Ventas");
    }
}