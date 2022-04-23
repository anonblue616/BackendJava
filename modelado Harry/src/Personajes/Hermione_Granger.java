package Personajes;

public class Hermione_Granger {
    public String casa, genero, nombre, bogart, patronus, descripcion;

    public static void main(String[] args) {
        Hermione_Granger Hermione  = new Hermione_Granger();

        Hermione .casa = "Gryffindor";
        Hermione .genero = "Femenino";
        Hermione .nombre = "Tom Sorvolo Ryddle";
        Hermione .bogart = "La profesora McGonagall diciéndole que reprobó todo";
        Hermione .patronus =  "Nutria";
        Hermione .descripcion = "¿Pero por qué tiene que ir a la biblioteca?»\n" +
                "Ronald Weasley: «Porque eso es lo que Hermione hace cuando tiene alguna duda, ir a la biblioteca";

        System.out.println("Casa: " +Hermione .casa);
        System.out.println("Genero: " +Hermione .genero);
        System.out.println("Nombre: " +Hermione .nombre);
        System.out.println("bogart: " +Hermione .bogart);
        System.out.println("Patronus: " +Hermione .patronus);
        System.out.println("Descripcion: " +Hermione .descripcion);
    }
}
