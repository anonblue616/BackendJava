package Personajes;

public class Harry_Potter {
    public String casa, genero, nombre, bogart, patronus, descripcion;

    public static void main(String[] args) {
        Harry_Potter harry = new Harry_Potter();

        harry.casa = "Gryffindor";
        harry.genero = "Masculino";
        harry.nombre = "Harry James Potter";
        harry.bogart = "Dementor";
        harry.patronus =  "Ciervo";
        harry.descripcion = "¡Lo que significa que te protege tu capacidad de amar! ¡Esa es la única protección efectiva contra unas ansias de poder como las de Voldemort! ";

        System.out.println("Casa: " +harry.casa);
        System.out.println("Genero: " +harry.genero);
        System.out.println("Nombre: " +harry.nombre);
        System.out.println("bogart: " +harry.bogart);
        System.out.println("Patronus: " +harry.patronus);
        System.out.println("Descripcion: " +harry.descripcion);
    }
}
