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
 * Clase Control que actúa como controlador en la aplicación, encargada de
 * gestionar las operaciones relacionadas con los pedidos. Se comunica con la
 * capa de acceso a datos a través de la clase PedidoDAO y utiliza la clase
 * Convertidor para realizar conversiones entre objetos de dominio (Pedido) y
 * objetos de transferencia de datos (PedidoDTO).
 *
 * @author JESUS
 */
public class Control {

    PedidoDAO p;
    Convertidor c;

    /**
     * Constructor de la clase Control. Inicializa las instancias de PedidoDAO y
     * Convertidor.
     */
    public Control() {
        p = new PedidoDAO();
        c = new Convertidor();
    }

    /**
     * Consulta los pedidos realizados en una fecha específica y los devuelve
     * como una lista de objetos PedidoDTO.
     *
     * @param fecha la fecha en la que se realizaron los pedidos a consultar.
     * @return una lista de objetos PedidoDTO correspondientes a los pedidos
     * realizados en la fecha dada, o null si no se encontraron pedidos.
     */
    public List<PedidoDTO> consultarPedidos(Calendar fecha) {
        List<PedidoDTO> pedidosFiltrados = new ArrayList<>();
        List<Pedido> pedidos = p.consultarPedidoFecha(fecha);

        if (pedidos != null) {
            for (Pedido pedido : pedidos) {
                PedidoDTO pedidoDTO = c.convPedidoDTO(pedido);
                pedidosFiltrados.add(pedidoDTO);
            }
            return pedidosFiltrados;
        }
        return null;
    }

    /**
     * Consulta un pedido específico basado en los datos proporcionados en
     * PedidoDTO.
     *
     * @param pedido el objeto PedidoDTO que contiene los datos del pedido a
     * consultar.
     * @return el objeto PedidoDTO correspondiente al pedido consultado, o null
     * si no se encuentra.
     */
    public PedidoDTO consultaPedido(PedidoDTO pedido) {
        PedidoDTO ped = c.convPedidoDTO(p.consultarPedido(c.convPedido(pedido)));
        return ped;
    }

    /**
     * Agrega un nuevo pedido al sistema.
     *
     * @param pedido el objeto PedidoDTO que representa el pedido a agregar.
     * @return el objeto PedidoDTO correspondiente al pedido agregado.
     */
    public PedidoDTO agregarPedido(PedidoDTO pedido) {
        PedidoDTO ped = c.convPedidoDTO(p.agregarPedido(c.convPedido(pedido)));
        return ped;
    }

    /**
     * Actualiza un pedido existente en el sistema.
     *
     * @param pedido el objeto PedidoDTO que contiene los nuevos datos del
     * pedido.
     * @return el objeto PedidoDTO correspondiente al pedido actualizado.
     */
    public PedidoDTO actualizarPedido(PedidoDTO pedido) {
        PedidoDTO ped = c.convPedidoDTO(p.actualizarPedido(c.convPedido(pedido)));
        return ped;
    }

    /**
     * Cancela un pedido existente en el sistema.
     *
     * @param pedido el objeto PedidoDTO que representa el pedido a cancelar.
     * @return el objeto PedidoDTO correspondiente al pedido cancelado.
     */
    public PedidoDTO cancelarPedido(PedidoDTO pedido) {
        PedidoDTO ped = c.convPedidoDTO(p.cancelarPedido(c.convPedido(pedido)));
        return ped;
    }

}
