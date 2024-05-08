package Facade_Vuelos;

public class BuscadorFacade implements IBuscador{
    private ApiVuelo apiVuelo;
    private ApiHotel apiHotel;

    public BuscadorFacade() {
        apiVuelo = new ApiVuelo();
        apiHotel = new ApiHotel();
    }

    @Override
    public void buscador(Vuelo vuelo, Hotel hotel) {
        System.out.println("Vuelo y hotel encontrados: \n" + apiVuelo.buscador(vuelo)+ apiHotel.buscador(hotel));
    }
}
