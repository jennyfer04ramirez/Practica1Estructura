/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/

package ec.edu.ups.practicaestructura1tienda.modelo;
import java.util.Stack;

/**
 *
 * @author casa
 */

public class Venta<T> {

    // Atributos de la clase Venta
    private Stack<String> historialDeVentas;

    // Constructor de la clase donde se inicializa la lista
    public Venta() {
        historialDeVentas = new Stack<>();
    }

    // Método para registrar las ventas mediante el .push
    public void registrarVenta(String registro) {
        historialDeVentas.push(registro);
    }

    // Método de la clase para obtener la ultima venta
    public String obtenerUltimaVenta() {
        if (!historialDeVentas.isEmpty()) {
            return historialDeVentas.peek();
        }
        return null;
    }
}

