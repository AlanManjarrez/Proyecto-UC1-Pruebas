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
        List<Alimento> alimentos = new ArrayList<>();
        List<Pedido> pedidos = new ArrayList<>();
        Pedido pedido = new Pedido(Estado.LISTO, "2", fecha);
        pedidos.add(pedido);
        
        Alimento alimento1 = new Alimento("Hamburguesa", pedidos);
        Alimento alimento2 = new Alimento("Pizza", pedidos);
        alimentos.add(alimento1);
        alimentos.add(alimento2);

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("conexionPU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        
        entityManager.getTransaction().begin();
        
        entityManager.persist(alimento1);
        entityManager.persist(alimento2);
        entityManager.persist(pedido);
        
        entityManager.getTransaction().commit();
        
        entityManager.close();
        entityManagerFactory.close();
    }
}
