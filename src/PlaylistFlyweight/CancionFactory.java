package PlaylistFlyweight;

import java.util.HashMap;
import java.util.Map;

class CancionFactory {
    private Map<String, Cancion> cancionesCache = new HashMap<>();

    public Cancion crearCancion(String nombre, String artista, String genero) {
        String key = generarKey(nombre, artista, genero);
        Cancion cancion = cancionesCache.get(key);

        if (cancion == null) {
            cancion = new Cancion(nombre, artista, genero);
            cancionesCache.put(key, cancion);
        }

        return cancion;
    }

    private String generarKey(String nombre, String artista, String genero) {
        return nombre + "-" + artista + "-" + genero;
    }
}