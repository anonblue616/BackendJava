package Personajes;

public class Severus {
    public String casa, genero, nombre, bogart, patronus, descripcion;

    public static void main(String[] args) {
        Severus Snape = new Severus();

        Snape.casa = "Slytherin";
        Snape.genero = "Masculino";
        Snape.nombre = "Severus Snape";
        Snape.bogart = "Lord Voldemort ";
        Snape.patronus =  "Cierva";
        Snape.descripcion = "Vosotros estáis aquí para aprender la sutil ciencia y el arte exacto de hacer pociones. Aquí habrá muy poco de estúpidos movimientos de varita y muchos de vosotros dudaréis que esto sea magia. No espero que lleguéis a entender la belleza de un caldero hirviendo suavemente, con sus vapores relucientes, el delicado poder de los líquidos que se deslizan a través de las venas humanas, hechizando la mente, engañando los sentidos... Puedo enseñaros cómo embotellar la fama, preparar la gloria, hasta detener la muerte... si sois algo más que los alcornoques a los que habitualmente tengo que enseñar.";

        System.out.println("Casa: " +Snape.casa);
        System.out.println("Genero: " +Snape.genero);
        System.out.println("Nombre: " +Snape.nombre);
        System.out.println("bogart: " +Snape.bogart);
        System.out.println("Patronus: " +Snape.patronus);
        System.out.println("Descripcion: " +Snape.descripcion);
    }

}
