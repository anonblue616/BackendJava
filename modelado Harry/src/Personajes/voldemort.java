package Personajes;

public class voldemort {
    public String casa, genero, nombre, bogart, patronus, descripcion;

    public static void main(String[] args) {
        voldemort voldemort = new voldemort();

        voldemort.casa = "Slytherin";
        voldemort.genero = "Masculino";
        voldemort.nombre = "Tom Sorvolo Ryddle";
        voldemort.bogart = "Su propia muerte";
        voldemort.patronus =  "serpiente";
        voldemort.descripcion = "Solo yo viviré; por siempre";

        System.out.println("Casa: " +voldemort.casa);
        System.out.println("Genero: " +voldemort.genero);
        System.out.println("Nombre: " +voldemort.nombre);
        System.out.println("bogart: " +voldemort.bogart);
        System.out.println("Patronus: " +voldemort.patronus);
        System.out.println("Descripcion: " +voldemort.descripcion);
    }

}
