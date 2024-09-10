
package DTO;

/**
 * Enumeración EstadoDTO que representa los diferentes estados posibles de un pedido.
 * Se utiliza en la capa de transporte de datos (DTO) para indicar el estado actual de un pedido.
 * 
 * Los estados posibles son:
 * - PREPARACION: El pedido está en proceso de preparación.
 * - LISTO: El pedido está listo para ser entregado.
 * - ENTREGADO: El pedido ha sido entregado al cliente.
 * 
 * @author JESUS
 */
public enum EstadoDTO {
    PREPARACION, 
    LISTO, 
    ENTREGADO;
}
