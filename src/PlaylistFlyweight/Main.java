package PlaylistFlyweight;

public class Main {
    public static void main(String[] args) {
        CancionFactory cancionFactory = new CancionFactory();

        // Crear canciones
        Cancion cancion1 = cancionFactory.crearCancion("Rational Gaze", "Meshuggah", "Metal");
        Cancion cancion2 = cancionFactory.crearCancion("La Corriente", "La Nueva Escuela", "Plena");
        Cancion cancion3 = cancionFactory.crearCancion("Welcome to Jamrock", "Damian Marley", "Reggae");

        // Crear lista de reproducción
        ListaReproduccion listaReproduccion = new ListaReproduccion("Las favoritas de Mathi");

        // Agregar canciones a la lista de reproducción
        listaReproduccion.agregarCancion(cancion1);
        listaReproduccion.agregarCancion(cancion2);
        listaReproduccion.agregarCancion(cancion3);

        // Mostrar canciones de la lista de reproducción
        System.out.println("Canciones en la lista de reproducción '" + listaReproduccion.nombre + "':");
        for (Cancion cancion : listaReproduccion.obtenerCanciones()) {
            System.out.println(cancion.getNombre() + " - " + cancion.getArtista() + " (" + cancion.getGenero() + ")");
        }
    }
}