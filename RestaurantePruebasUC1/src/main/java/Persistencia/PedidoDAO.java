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

    public void agregarPedido(Pedido pedido) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("conexionPU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(pedido);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            if (entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback();
            }
            e.printStackTrace();
        }
        entityManager.close();
        entityManagerFactory.close();
    }

    public List<Pedido> consultarPedidoFecha(Calendar fecha) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("conexionPU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        try {
            entityManager.getTransaction().begin();
            return entityManager.createQuery("SELECT P FROM pedido P WHERE P.FECHA = :fecha", Pedido.class).getResultList();
            
        } catch (Exception e) {
            
        }
        return null;
    }

    public void cancelarPedido(Pedido pedido) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("conexionPU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            entityManager.getTransaction().begin();
            entityManager.remove(pedido);
            entityManager.getTransaction().commit();

        } catch (Exception e) {
            if (entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback();
            }
            e.printStackTrace();
        }
        entityManager.close();
        entityManagerFactory.close();
    }
}
