package Flyweight_MesasClase5;

public class Bosque {
    private ArbolFactory fabricaArboles=new ArbolFactory();
    private final int LIMITE_ARBOLES = 1000000;

    public void plantarArboles() {
        for (int i = 0; i < LIMITE_ARBOLES/2; i++) {
            fabricaArboles.crearArbol("Ornamental");
            fabricaArboles.crearArbol("Frutal");
        }
        System.out.println("Arboles plantados: " + Arbol.getContador());
        // System.out.println("Tipos de arboles: " + Arbol.);
    }


}