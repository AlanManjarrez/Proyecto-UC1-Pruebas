/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import java.io.Serializable;
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

/**
 *
 * @author uirtis
 */
@Entity(name = "alimentos")
public class Alimento implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_alimento", referencedColumnName = "id")
    private List<Pedido> pedido;

    public Alimento() {
    }

    public Alimento(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Alimento(String nombre) {
        this.nombre = nombre;
    }

    public Alimento(String nombre, List<Pedido> pedido) {
        this.nombre = nombre;
        this.pedido = pedido;
    }

    public List<Pedido> getPedido() {
        return pedido;
    }

    public void setPedido(List<Pedido> pedido) {
        this.pedido = pedido;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Alimento{" + "id=" + id + ", nombre=" + nombre + '}';
    }
    
}
