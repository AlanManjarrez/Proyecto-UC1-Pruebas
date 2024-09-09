/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.util.Calendar;

/**
 *
 * @author JESUS
 */
public class PedidoDTO {
    private Long id;
    private EstadoDTO estado;
    private String alimento;
    private Calendar fecha;

    public PedidoDTO() {
    }

    public PedidoDTO(Long id, EstadoDTO estado, String alimento, Calendar fecha) {
        this.id = id;
        this.estado = estado;
        this.alimento = alimento;
        this.fecha = fecha;
    }

    public PedidoDTO(EstadoDTO estado, String alimento, Calendar fecha) {
        this.estado = estado;
        this.alimento = alimento;
        this.fecha = fecha;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public EstadoDTO getEstado() {
        return estado;
    }

    public void setEstado(EstadoDTO estado) {
        this.estado = estado;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }
    
    
    
}
