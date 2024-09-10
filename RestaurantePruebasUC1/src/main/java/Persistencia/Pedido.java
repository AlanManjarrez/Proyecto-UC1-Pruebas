/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Clase Pedido que representa la entidad de un pedido en la base de datos. Esta
 * clase está mapeada a la tabla "pedidos" y utiliza JPA (Java Persistence API)
 * para persistir los datos. Cada pedido tiene un identificador único, un
 * estado, un alimento y una fecha en la que se realizó el pedido.
 *
 * La clase implementa Serializable para permitir su serialización.
 *
 * @author uirtis
 */
@Entity(name = "pedidos")
@PrimaryKeyJoinColumn(referencedColumnName = "id")
public class Pedido implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "estado", nullable = false)
    private Estado estado;

    @Column(name = "alimento", nullable = false, length = 500)
    private String alimento;

    @Column(name = "fecha", nullable = false)
    @Temporal(TemporalType.DATE)
    private Calendar fecha;

    /**
     * Constructor por defecto de la clase Pedido.
     */
    public Pedido() {
    }

    /**
     * Constructor de la clase Pedido que inicializa todos los atributos.
     *
     * @param id el identificador único del pedido.
     * @param estado el estado actual del pedido.
     * @param alimento el alimento solicitado en el pedido.
     * @param fecha la fecha en la que se realizó el pedido.
     */
    public Pedido(Long id, Estado estado, String alimento, Calendar fecha) {
        this.id = id;
        this.estado = estado;
        this.alimento = alimento;
        this.fecha = fecha;
    }

    /**
     * Constructor que inicializa el pedido sin identificador (útil para nuevos
     * pedidos).
     *
     * @param estado el estado del pedido.
     * @param alimento el alimento solicitado.
     * @param fecha la fecha en que se realizó el pedido.
     */
    public Pedido(Estado estado, String alimento, Calendar fecha) {
        this.estado = estado;
        this.alimento = alimento;

        this.fecha = fecha;
    }

    /**
     * Obtiene el estado actual del pedido.
     *
     * @return el estado del pedido.
     */
    public Estado getEstado() {
        return estado;
    }

    /**
     * Establece el estado del pedido.
     *
     * @param estado el nuevo estado del pedido.
     */
    public void setEstado(Estado estado) {
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
     * Devuelve una representación en forma de cadena del pedido.
     *
     * @return una cadena que describe el pedido.
     */
    @Override
    public String toString() {
        return "Pedido{" + "id=" + id + ", estado=" + estado + ", alimento=" + alimento + ", fecha=" + fecha + '}';
    }

}
