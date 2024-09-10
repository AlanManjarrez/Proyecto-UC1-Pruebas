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
 * @author joarv
 */
public class Pruebas {
    
    private PedidoDAO ped=new PedidoDAO();
    
    
    public Pruebas() {
    }
    
    
    @Test
    public void testAgregarPedido() {
        Calendar fecha= Calendar.getInstance();
        Pedido pedido = new Pedido(Estado.ENTREGADO, "Hamburguesa 8, dudhi 5, Ensalada 1", fecha);
        
        Pedido resultado=ped.agregarPedido(pedido);
        
        assertNotNull(resultado);
        assertEquals(pedido, resultado);
    }
    
    @Test
    public void testConsultarPedidoFecha() {
        Calendar fecha = Calendar.getInstance();
        Pedido pedido = new Pedido();
        pedido.setFecha(fecha);
        
        List<Pedido> resultados = ped.consultarPedidoFecha(fecha);
        
        assertNotNull(resultados);
        assertFalse(resultados.isEmpty());
        assertEquals(4, resultados.size());
        
    }
    
    @Test
    public void testCancelarPedido() {
        Calendar fecha=Calendar.getInstance();
        Pedido pedido = new Pedido(Estado.ENTREGADO, "Hamburguesa 1", fecha);
        Pedido agregado = ped.agregarPedido(pedido);
        
        assertNotNull(agregado);
        Pedido resultado = ped.cancelarPedido(agregado);
        
        assertNull(resultado);
    }
    
    @Test
    public void testConsultarPedido(){
        Calendar fecha=Calendar.getInstance();
        Pedido pedido = new Pedido(Estado.ENTREGADO, "Hamburguesa 1", fecha);
        Pedido agregado = ped.agregarPedido(pedido);
        
        assertNotNull(agregado);

        Pedido consultado = ped.consultarPedido(agregado);
        
        assertNotNull(consultado);
        assertEquals(agregado.getId(), consultado.getId());
    }
    
    @Test
    public void testActualizar(){
        Calendar fecha=Calendar.getInstance();
        Pedido pedido = new Pedido(Estado.ENTREGADO, "Hamburguesa 8, dudhi 5, Ensalada 1", fecha);
        Pedido agregado = ped.agregarPedido(pedido);
        
        assertNotNull(agregado);
        
        agregado.setAlimento("nuevo");
        Pedido actualizado = ped.actualizarPedido(agregado);
        
        assertNotNull(actualizado);
        assertEquals("nuevo", actualizado.getAlimento());
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
