package animales;

public class Pez extends Animal {
    protected String tipoAgua;
    public Pez(String especie, String tipoAgua){
        super(especie);
        this.tipoAgua = tipoAgua;
    }
    public void mostrarEspecie() {
        super.mostrarEspecie();
        System.out.println("Tipo de agua: " + tipoAgua);
    }

    public static void main(String[] args) {
        var felino = new Animal("Tigre");
        var pez = new Pez("Betta", "Agua dulce");
        felino.mostrarEspecie();
        System.out.println("----------------");
        pez.mostrarEspecie();
    }
}