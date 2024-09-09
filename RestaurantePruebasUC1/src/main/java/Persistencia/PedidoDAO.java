/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import java.util.Calendar;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author uirtis
 */
public class PedidoDAO {

    public Pedido agregarPedido(Pedido pedido) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("conexionPU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(pedido);
            entityManager.getTransaction().commit();
            return pedido;
        } catch (Exception e) {
            if (entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback();
            }
            e.printStackTrace();
        }finally{
            entityManager.close();
            entityManagerFactory.close();
        }
        return null;
        
    }

    public List<Pedido> consultarPedidoFecha(Calendar fecha) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("conexionPU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        try {
            entityManager.getTransaction().begin();
            List<Pedido> resultados = entityManager.createQuery("SELECT P FROM pedidos P WHERE P.fecha = :fecha", Pedido.class)
            .setParameter("fecha", fecha)
            .getResultList();
            
            entityManager.getTransaction().commit(); 
            return resultados;
        } catch (Exception e) {
            if (entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback(); 
            }
            e.printStackTrace();
        }finally{
            entityManager.close();
            entityManagerFactory.close();
        }
        return null;
    }

    public Pedido cancelarPedido(Pedido pedido) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("conexionPU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            entityManager.getTransaction().begin();
            
            Pedido pedidoManaged = entityManager.find(Pedido.class, pedido.getId());
            entityManager.remove(pedidoManaged);
            
            entityManager.getTransaction().commit();
            return null;
        } catch (Exception e) {
            if (entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback();
            }
            e.printStackTrace();
        } finally {
          entityManager.close();
          entityManagerFactory.close();
        }
        return pedido;
    }
    
    public Pedido actualizarPedido(Pedido pedido) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("conexionPU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        try {
            entityManager.getTransaction().begin();

            Pedido pedidoExistente = entityManager.find(Pedido.class, pedido.getId());
       
            entityManager.merge(pedido);
            entityManager.getTransaction().commit();
            return pedido;

        } catch (Exception e) {
            if (entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback(); 
            }
            e.printStackTrace(); 
        } finally {
            entityManager.close(); 
            entityManagerFactory.close(); 
        }
        return null; 
    }
    
    
    
}
