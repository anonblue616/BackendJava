package Personajes;



public class Luna_Lovegood {
    String casa;
    String genero;
    String nombre;
    String bogart;
    String patronus;
    String descripcion;

    public static void main(String[] args) {
        Luna_Lovegood luna = new Luna_Lovegood();

        luna.casa = "Ravenclaw";
        luna.genero = "Femenino";
        luna.nombre = "Luna Lovegood";
        luna.bogart = "Not found";
        luna.patronus = "Liebre";
        luna.descripcion = "La muchacha que había sentada junto a la ventana levantó la cabeza. Tenía el pelo rubio, sucio y desgreñado, \n largo hasta la cintura, cejas muy claras y unos ojos saltones que le daban un aire de sorpresa permanente. La muchacha tenía" + "\n" + "un aire inconfundible de chiflada. Quizá contribuyera a ello que se había colocado la varita mágica detrás de la oreja izquierda, \n o que llevaba un collar hecho con corchos de cerveza de mantequilla, o que estaba leyendo una revista al revés";

        System.out.println("Casa: " +luna.casa);
        System.out.println("Genero: " +luna.genero);
        System.out.println("Nombre: " +luna.nombre);
        System.out.println("bogart: " +luna.bogart);
        System.out.println("Patronus: " +luna.patronus);
        System.out.println("Descripcion: " +luna.descripcion);
    }

}
