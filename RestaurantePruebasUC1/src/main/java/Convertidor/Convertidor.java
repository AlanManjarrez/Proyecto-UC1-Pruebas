/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Convertidor;

import DTO.EstadoDTO;
import DTO.PedidoDTO;
import Persistencia.Pedido;
import Persistencia.Estado;
/**
 *
 * @author JESUS
 */
public class Convertidor {
    
    public Convertidor(){
        
    }
    
    public PedidoDTO convPedidoDTO(Pedido ped){
        if (ped !=null) {
             EstadoDTO estadoDTO = EstadoDTO.valueOf(ped.getEstado().name());
            return new PedidoDTO(ped.getId(),estadoDTO,ped.getAlimento(),ped.getFecha());
            
        }       
        return null;
    }
    
    public Pedido convPedido(PedidoDTO ped){
        Estado estado= Estado.valueOf(ped.getEstado().name());
        return new Pedido(ped.getId(), estado, ped.getAlimento(), ped.getFecha());
    }
    
}
