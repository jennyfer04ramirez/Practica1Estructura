/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practicaestructura1tienda.modelo;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author casa
 */


public class Inventario<T> {
    
    // Atributo de la clase Inventario
    private LinkedList<Producto<T>> inventario;

    // Constructor de la clase instanciando la lista 
    public Inventario() {
        inventario = new LinkedList<>();
    }

    // Método de la clase para agregar un producto mediante el .add
    public void agregarProducto(Producto<T> producto) {
        inventario.add(producto);
    }

    // Método para actualizar una cantidad del producto mediante los parametros del codigo y de la cantidad
    public void actualizarCantidadProducto(T codigo, int cantidad) {
        // For que recorre la lista de Productos
        for (Producto<T> producto : inventario) {
            // Se compara mediante el equals el codigo obtenido con el codigo de la lista 
            if (producto.getCodigo().equals(codigo)) {
                producto.setCantidadDisponible(cantidad);
                break;
            }
        }
    }

    // Método para obtener el inventario devolviendo la lista de productos
    public List<Producto<T>> obtenerInventario() {
        return inventario;
    }
}
