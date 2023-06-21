/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.practicaestructura1tienda.test;
import ec.edu.ups.practicaestructura1tienda.controlador.TiendaControlador;
import ec.edu.ups.practicaestructura1tienda.modelo.Inventario;
import ec.edu.ups.practicaestructura1tienda.modelo.Venta;
import ec.edu.ups.practicaestructura1tienda.vista.TiendaVista;

/**
 *
 * @author casa
 */
public class PracticaEstructura1Tienda {

    public static void main(String[] args) {
        Inventario<String> inventario = new Inventario<>();
        Venta<String> ventas = new Venta<>();
        TiendaVista tiendaVista = new TiendaVista();
        TiendaControlador<String> tiendaControlador = new TiendaControlador<>(inventario, ventas, tiendaVista);
        tiendaControlador.iniciar();
    }
}
