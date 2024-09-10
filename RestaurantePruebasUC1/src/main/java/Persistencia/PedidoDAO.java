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
 * Clase PedidoDAO que proporciona métodos para realizar operaciones CRUD
 * (Crear, Leer, Actualizar y Eliminar) en la entidad Pedido utilizando JPA
 * (Java Persistence API). Esta clase se comunica con la base de datos a través
 * de un EntityManager.
 *
 * @author uirtis
 */
public class PedidoDAO {

    /**
     * Agrega un nuevo pedido a la base de datos.
     *
     * @param pedido el objeto Pedido que se va a agregar.
     * @return el pedido agregado si la operación es exitosa, de lo contrario,
     * null.
     */
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
        } finally {
            entityManager.close();
            entityManagerFactory.close();
        }
        return null;

    }

    /**
     * Consulta los pedidos realizados en una fecha específica.
     *
     * @param fecha la fecha en la que se realizaron los pedidos.
     * @return una lista de pedidos realizados en la fecha dada, o null si
     * ocurre un error.
     */
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
        } finally {
            entityManager.close();
            entityManagerFactory.close();
        }
        return null;
    }

    /**
     * Consulta los pedidos realizados en una fecha específica.
     *
     * @param fecha la fecha en la que se realizaron los pedidos.
     * @return una lista de pedidos realizados en la fecha dada, o null si
     * ocurre un error.
     */
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

    /**
     * Actualiza un pedido existente en la base de datos.
     *
     * @param pedido el objeto Pedido que contiene los datos actualizados.
     * @return el pedido actualizado si la operación es exitosa, de lo
     * contrario, null.
     */
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

    /**
     * Consulta un pedido específico de la base de datos.
     *
     * @param pedido el objeto Pedido que se va a consultar.
     * @return el pedido consultado si se encuentra, de lo contrario, null.
     */
    public Pedido consultarPedido(Pedido pedido) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("conexionPU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        try {
            entityManager.getTransaction().begin();

            Pedido pedidoManaged = entityManager.find(Pedido.class, pedido.getId());

            entityManager.getTransaction().commit();
            return pedidoManaged;

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
