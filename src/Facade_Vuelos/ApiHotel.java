package Facade_Vuelos;

public class ApiHotel {
    public String buscador(Hotel hotel){
        return "Hotel encontrado en " + hotel.getCiudad() + " el " + hotel.getFechaEntrada();
    }
}
