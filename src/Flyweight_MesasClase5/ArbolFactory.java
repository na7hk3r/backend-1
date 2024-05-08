package Flyweight_MesasClase5;

import java.util.HashMap;
import java.util.Map;

public class ArbolFactory {
    public static final Map<String, Arbol> arbolMap = new HashMap<>();


    public Arbol crearArbol(final String tipo) {
        Arbol arbol = arbolMap.get(tipo);
        if (arbol == null) {
            arbol = new Arbol(tipo);
            switch (tipo) {
                case "Ornamental" -> {
                    arbol.setAncho(200);
                    arbol.setAlto(400);
                    arbol.setColor("Verde");
                    arbolMap.put(tipo, arbol);
                    System.out.println("Arbol Ornamental creado");
                    return arbol;
                }
                case "Frutal" -> {
                    arbol.setAncho(500);
                    arbol.setAlto(300);
                    arbol.setColor("Rojo");
                    arbolMap.put(tipo, arbol);
                    System.out.println("Arbol Frutal creado");
                    return arbol;
                }
                case "Floral" -> {
                    arbol.setAncho(100);
                    arbol.setAlto(200);
                    arbol.setColor("Celeste");
                    arbolMap.put(tipo, arbol);
                    System.out.println("Arbol Floral creado");
                    return arbol;
                }
                default ->
                        System.out.println("Arbol no existe");
            }

        }
        System.out.println(Arbol.getContador());
        return arbol;
    }
}