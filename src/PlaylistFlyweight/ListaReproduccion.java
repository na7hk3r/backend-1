package PlaylistFlyweight;

import java.util.ArrayList;
import java.util.List;

class ListaReproduccion {
    public String nombre;
    public List<Cancion> canciones;

    public ListaReproduccion(String nombre) {
        this.nombre = nombre;
        this.canciones = new ArrayList<>();
    }

    public void agregarCancion(Cancion cancion) {
        canciones.add(cancion);
    }

    public void eliminarCancion(Cancion cancion) {
        canciones.remove(cancion);
    }

    public List<Cancion> obtenerCanciones() {
        return canciones;
    }
}