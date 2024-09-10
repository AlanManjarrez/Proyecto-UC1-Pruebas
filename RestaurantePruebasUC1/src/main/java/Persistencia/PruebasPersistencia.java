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
 * Clase de prueba para la persistencia de datos en la base de datos. Esta clase
 * contiene el método principal (main) que se utiliza para probar las
 * operaciones de persistencia en la entidad Pedido.
 *
 * @author uirtis
 */
public class PruebasPersistencia {

    /**
     * Método principal que crea un objeto Pedido y lo persiste en la base de
     * datos.
     *
     * @param args argumentos de la línea de comandos (no utilizados en esta
     * clase).
     */
    public static void main(String[] args) {

        Calendar fecha = Calendar.getInstance();
        Pedido pedido3 = new Pedido(Estado.ENTREGADO, "Hamburguesa 8, dudhi 5, Ensalada 1", fecha);
        pedido3.setId(2L);
        PedidoDAO p = new PedidoDAO();
        p.agregarPedido(pedido3);
    }
}
