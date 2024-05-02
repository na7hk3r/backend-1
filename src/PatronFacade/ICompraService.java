package PatronFacade;

import PatronFacade.Direccion;
import PatronFacade.Tarjeta;

public interface ICompraService {

    public void procesarCompra(String productoId, Integer cantidad, Tarjeta tarjeta, Direccion direccion);
}
