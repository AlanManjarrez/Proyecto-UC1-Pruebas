/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author uirtis
 */
public class PruebasPersistencia {

    public static void main(String[] args) {

        Calendar fecha = Calendar.getInstance();
        Pedido pedido3 = new Pedido(Estado.ENTREGADO, "Hamburguesa 8, dudhi 5, Ensalada 1", fecha);
        pedido3.setId(2L);
        PedidoDAO p=new PedidoDAO();
        p.actualizarPedido(pedido3);
    }
}
