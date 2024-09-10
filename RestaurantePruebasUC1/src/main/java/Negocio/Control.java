/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

import DTO.PedidoDTO;
import Persistencia.Pedido;
import Persistencia.PedidoDAO;
import java.util.Calendar;
import java.util.List;
import Convertidor.Convertidor;
import java.util.ArrayList;

/**
 *
 * @author JESUS
 */
public class Control {
    PedidoDAO p;
    Convertidor c;
    public Control(){
        p=new PedidoDAO();
        c=new Convertidor();
    }
    
    
    public List<PedidoDTO> consultarPedidos(Calendar fecha){
        List<PedidoDTO> pedidosFiltrados = new ArrayList<>();
        List<Pedido> pedidos= p.consultarPedidoFecha(fecha);
        
        if (pedidos != null) {
            for (Pedido pedido : pedidos) {
                PedidoDTO pedidoDTO = c.convPedidoDTO(pedido);
                pedidosFiltrados.add(pedidoDTO);
            }
            return pedidosFiltrados;
        }
        return null;
    }
    
    public void consultaPedido(PedidoDTO pedido){
        
    }
    
    public PedidoDTO agregarPedido(PedidoDTO pedido){
        PedidoDTO ped=c.convPedidoDTO(p.agregarPedido(c.convPedido(pedido)));
        return ped;
    }
    
    public PedidoDTO actualizarPedido(PedidoDTO pedido){
        PedidoDTO ped= c.convPedidoDTO(p.actualizarPedido(c.convPedido(pedido)));
        return ped;
    }
    
    public PedidoDTO cancelarPedido(PedidoDTO pedido){
        PedidoDTO ped= c.convPedidoDTO(p.cancelarPedido(c.convPedido(pedido)));
        return ped;
    }
    
}
