/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import Persistencia.Estado;
import Persistencia.PedidoDAO;
import Persistencia.Pedido;
import java.util.Calendar;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Jesus Eduardo Villanueva Godoy
 */
public class Pruebas {
    
    //Instancia de PedidoDAO, que se encarga de la lógica de acceso a datos para los pedido
    private PedidoDAO ped=new PedidoDAO();
    
    
    public Pruebas() {
    }
    
    /**
     * Prueba para agregar un nuevo pedido
     */
    @Test
    public void testAgregarPedido() {
         // Se obtiene la fecha actual
        Calendar fecha = Calendar.getInstance();
        // Se crea un nuevo pedido con estado y detalles
        Pedido pedido = new Pedido(Estado.ENTREGADO, "Hamburguesa 8, dudhi 5, Ensalada 1", fecha);
        
        // Se agrega el pedido y se guarda el resultado
        Pedido resultado = ped.agregarPedido(pedido);
        
        // Se verifica que el resultado no sea nulo
        assertNotNull(resultado);
        // Se comprueba que el pedido agregado es el mismo que el creado
        assertEquals(pedido, resultado);
    }
    
    /**
     * Prueba para consultar pedidos por fecha
     */
    @Test
    public void testConsultarPedidoFecha() {
        // Se obtiene la fecha actual
        Calendar fecha = Calendar.getInstance();
        // Se crea un nuevo pedido (sin estado ni detalles)
        Pedido pedido = new Pedido();
        pedido.setFecha(fecha);
        
        // Se consultan los pedidos por la fecha dada
        List<Pedido> resultados = ped.consultarPedidoFecha(fecha);
        
        // Se verifica que la lista de resultados no sea nula
        assertNotNull(resultados);
        // Se comprueba que la lista no esté vacía
        assertFalse(resultados.isEmpty());
        // Se verifica que se esperen 4 resultados
        assertEquals(4, resultados.size());
    }
    
    /**
     * Prueba para cancelar un pedido
     */
    @Test
    public void testCancelarPedido() {
        Calendar fecha=Calendar.getInstance();
        Pedido pedido = new Pedido(Estado.ENTREGADO, "Hamburguesa 1", fecha);
        Pedido agregado = ped.agregarPedido(pedido);
        
        assertNotNull(agregado);
        Pedido resultado = ped.cancelarPedido(agregado);
        
        assertNull(resultado);
    }
    
    /**
     * Prueba para consultar un pedido específico
     */
    @Test
    public void testConsultarPedido(){
        // Se obtiene la fecha actual
        Calendar fecha = Calendar.getInstance();
        // Se crea un nuevo pedido
        Pedido pedido = new Pedido(Estado.ENTREGADO, "Hamburguesa 1", fecha);
        // Se agrega el pedido
        Pedido agregado = ped.agregarPedido(pedido);
        
        // Se verifica que el pedido agregado no sea nulo
        assertNotNull(agregado);

        // Se consulta el pedido agregado
        Pedido consultado = ped.consultarPedido(agregado);
        
        // Se verifica que el pedido consultado no sea nulo
        assertNotNull(consultado);
        // Se comprueba que los IDs coincidan
        assertEquals(agregado.getId(), consultado.getId());
    }
    
    /**
     * Prueba para actualizar un pedido
     */
    @Test
    public void testActualizar(){
        // Se obtiene la fecha actual
        Calendar fecha = Calendar.getInstance();
        // Se crea un nuevo pedido
        Pedido pedido = new Pedido(Estado.ENTREGADO, "Hamburguesa 8, dudhi 5, Ensalada 1", fecha);
        // Se agrega el pedido
        Pedido agregado = ped.agregarPedido(pedido);
        
        // Se verifica que el pedido agregado no sea nulo
        assertNotNull(agregado);
        
        // Se actualiza el alimento del pedido
        agregado.setAlimento("nuevo");
        // Se llama al método de actualización
        Pedido actualizado = ped.actualizarPedido(agregado);
        
        // Se verifica que el pedido actualizado no sea nulo
        assertNotNull(actualizado);
        // Se comprueba que el alimento actualizado sea el esperado
        assertEquals("nuevo", actualizado.getAlimento());
    }
    
}
