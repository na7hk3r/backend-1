package Facade_Vuelos;

public class ApiVuelo {
    public String buscador(Vuelo vuelo){
        return "Vuelo saliendo el " + vuelo.getFechaSalida()
                + "desde " + vuelo.getOrigen() + " con destino a " + vuelo.getDestino() + " \n";
    }
}
