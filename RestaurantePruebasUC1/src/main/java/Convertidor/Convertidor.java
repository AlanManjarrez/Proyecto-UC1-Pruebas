
package Convertidor;

import DTO.EstadoDTO;
import DTO.PedidoDTO;
import Persistencia.Pedido;
import Persistencia.Estado;

/**
 * Clase Convertidor que se encarga de convertir entre objetos Pedido y
 * PedidoDTO. Utiliza los métodos `convPedidoDTO` y `convPedido` para realizar
 * las conversiones.
 *
 * @author JESUS
 */
public class Convertidor {

    /**
     * Constructor vacío de la clase Convertidor.
     */
    public Convertidor() {

    }

    /**
     * Convierte un objeto de tipo Pedido a un objeto de tipo PedidoDTO.
     *
     * @param ped el objeto Pedido a convertir.
     * @return un objeto PedidoDTO equivalente, o null si el Pedido es null.
     */
    public PedidoDTO convPedidoDTO(Pedido ped) {
        if (ped != null) {
            EstadoDTO estadoDTO = EstadoDTO.valueOf(ped.getEstado().name());
            return new PedidoDTO(ped.getId(), estadoDTO, ped.getAlimento(), ped.getFecha());

        }
        return null;
    }

    /**
     * Convierte un objeto de tipo PedidoDTO a un objeto de tipo Pedido.
     *
     * @param ped el objeto PedidoDTO a convertir.
     * @return un objeto Pedido equivalente.
     */
    public Pedido convPedido(PedidoDTO ped) {
        Estado estado = Estado.valueOf(ped.getEstado().name());
        return new Pedido(ped.getId(), estado, ped.getAlimento(), ped.getFecha());
    }

}
