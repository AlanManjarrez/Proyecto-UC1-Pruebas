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

//    @OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name = "id_pedido", referencedColumnName = "id")
//    private List<Alimento> alimento;

    @Column(name = "cantidad", nullable = false)
    private String cantidad;

    @Column(name = "fecha", nullable = false)
    @Temporal(TemporalType.DATE)
    private Calendar fecha;

    public Pedido() {
    }

    public Pedido(Long id, Estado estado,  String cantidad, Calendar fecha) {
        this.id = id;
        this.estado = estado;
        
        this.cantidad = cantidad;
        this.fecha = fecha;
    }

    public Pedido(Estado estado,  String cantidad, Calendar fecha) {
        this.estado = estado;
        
        this.cantidad = cantidad;
        this.fecha = fecha;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

//    public List<Alimento> getAlimento() {
//        return alimento;
//    }
//
//    public void setAlimento(List<Alimento> alimento) {
//        this.alimento = alimento;
//    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Pedido{" + "id=" + id + ", estado=" + estado + ", cantidad=" + cantidad + ", fecha=" + fecha + '}';
    }

   
}
