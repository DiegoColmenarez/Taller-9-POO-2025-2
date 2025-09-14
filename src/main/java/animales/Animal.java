package animales;

public class Animal {
    private String especie;
    public Animal(String especie){
        //super(especie);
        this.especie = especie;
    }
    public void mostrarEspecie(){
        //super.mostrarEspecie();
        System.out.println("Especie: " + especie);
    }
}