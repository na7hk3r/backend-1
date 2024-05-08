package Facade_Vuelos;

public class Cliente {
    public static void main(String[] args) {
    Vuelo vuelo= new Vuelo("2 de Mayo", "3 de Julio",  "Montevideo", "California");
    Hotel hotel= new Hotel("3 de Mayo", "2 de Julio", "San Diego");

    BuscadorFacade facade= new BuscadorFacade();
    facade.buscador(vuelo, hotel);
}
}
