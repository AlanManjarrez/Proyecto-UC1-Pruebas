package DTO;

import java.util.Calendar;

/**
 * Clase PedidoDTO que representa un Data Transfer Object (DTO) para un pedido.
 * Esta clase se utiliza para transportar los datos de un pedido entre las
 * distintas capas de la aplicación.
 *
 * @author JESUS
 */
public class PedidoDTO {

    private Long id;
    private EstadoDTO estado;
    private String alimento;
    private Calendar fecha;

    /**
     * Constructor por defecto de la clase PedidoDTO.
     */
    public PedidoDTO() {
    }

    /**
     * Constructor de la clase PedidoDTO que inicializa todos los atributos.
     *
     * @param id el identificador único del pedido.
     * @param estado el estado del pedido representado por la enumeración
     * EstadoDTO.
     * @param alimento el alimento solicitado en el pedido.
     * @param fecha la fecha en la que se realizó el pedido.
     */
    public PedidoDTO(Long id, EstadoDTO estado, String alimento, Calendar fecha) {
        this.id = id;
        this.estado = estado;
        this.alimento = alimento;
        this.fecha = fecha;
    }

    /**
     * Constructor que inicializa el pedido sin un identificador, útil para
     * nuevos pedidos.
     *
     * @param estado el estado del pedido.
     * @param alimento el alimento solicitado.
     * @param fecha la fecha en que se realizó el pedido.
     */
    public PedidoDTO(EstadoDTO estado, String alimento, Calendar fecha) {
        this.estado = estado;
        this.alimento = alimento;
        this.fecha = fecha;
    }

    /**
     * Obtiene el identificador único del pedido.
     *
     * @return el ID del pedido.
     */
    public Long getId() {
        return id;
    }

    /**
     * Establece el identificador único del pedido.
     *
     * @param id el nuevo ID del pedido.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Obtiene el estado actual del pedido.
     *
     * @return el estado del pedido.
     */
    public EstadoDTO getEstado() {
        return estado;
    }

    /**
     * Establece el estado actual del pedido.
     *
     * @param estado el nuevo estado del pedido.
     */
    public void setEstado(EstadoDTO estado) {
        this.estado = estado;
    }

    /**
     * Obtiene el alimento solicitado en el pedido.
     *
     * @return el alimento del pedido.
     */
    public String getAlimento() {
        return alimento;
    }

    /**
     * Establece el alimento solicitado en el pedido.
     *
     * @param alimento el nuevo alimento del pedido.
     */
    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    /**
     * Obtiene la fecha en la que se realizó el pedido.
     *
     * @return la fecha del pedido.
     */
    public Calendar getFecha() {
        return fecha;
    }

    /**
     * Establece la fecha en la que se realizó el pedido.
     *
     * @param fecha la nueva fecha del pedido.
     */
    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

}
