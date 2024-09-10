/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Persistencia;

/**
 * Enumeración Estado que representa los diferentes estados posibles de un pedido
 * en el sistema de dominio. Esta enumeración se utiliza en la capa lógica del negocio
 * para indicar el estado actual de un pedido.
 * 
 * Los estados posibles son:
 * - PREPARACION: El pedido está en proceso de preparación.
 * - LISTO: El pedido está listo para ser entregado.
 * - ENTREGADO: El pedido ha sido entregado al cliente.
 * 
 * @author uirtis
 */

public enum Estado {
    PREPARACION, 
    LISTO, 
    ENTREGADO;
}
