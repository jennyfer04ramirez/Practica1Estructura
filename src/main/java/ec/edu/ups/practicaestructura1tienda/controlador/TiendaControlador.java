/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practicaestructura1tienda.controlador;
import ec.edu.ups.practicaestructura1tienda.modelo.Inventario;
import ec.edu.ups.practicaestructura1tienda.modelo.Producto;
import ec.edu.ups.practicaestructura1tienda.modelo.Venta;
import ec.edu.ups.practicaestructura1tienda.vista.TiendaVista;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author casa
 */

public class TiendaControlador<T> {

    // Atributos de la clase
    private Inventario<T> inventarioModelo;
    private Venta<T> ventaModel;
    private TiendaVista<T> tiendaView;

    // Constructor de la clase donde se instancian los atributos
    public TiendaControlador(Inventario<T> inventarioModelo, Venta<T> ventaModel, TiendaVista<T> tiendaView) {
        this.inventarioModelo = inventarioModelo;
        this.ventaModel = ventaModel;
        this.tiendaView = tiendaView;
    }

    public void iniciar() {
        boolean salir = false;
        Scanner scanner = new Scanner(System.in);

        while (!salir) {
            tiendaView.mostrarMenu();
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    Producto<T> nuevoProducto = tiendaView.solicitarDatosProducto();
                    inventarioModelo.agregarProducto(nuevoProducto);
                    tiendaView.mostrarMensaje("Producto agregado correctamente.");
                    break;
                case 2:
                    T codigoProducto = tiendaView.solicitarCodigoProducto();
                    int cantidadVenta = tiendaView.solicitarCantidadVenta();

                    boolean productoEncontrado = false;
                    for (Producto<T> producto : inventarioModelo.obtenerInventario()) {
                        if (producto.getCodigo().equals(codigoProducto)) {
                            productoEncontrado = true;

                            if (producto.getCantidadDisponible() >= cantidadVenta) {

                                int nuevaCantidad = producto.getCantidadDisponible() - cantidadVenta;
                                inventarioModelo.actualizarCantidadProducto(codigoProducto, nuevaCantidad);

                                String registroVenta = "Producto: " + producto.getNombre() + ", Cantidad: " + cantidadVenta;
                                ventaModel.registrarVenta(registroVenta);

                                tiendaView.mostrarMensaje("Venta realizada correctamente.");
                            } else {
                                tiendaView.mostrarMensaje("No hay suficiente cantidad disponible para la venta.");
                            }
                            break;
                        }
                    }

                    if (!productoEncontrado) {
                        tiendaView.mostrarMensaje("El producto no existe en el inventario.");
                    }
                    break;
                case 3:
                    List<Producto<T>> inventario = inventarioModelo.obtenerInventario();
                    tiendaView.mostrarInventario(inventario);
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    tiendaView.mostrarMensaje("Opción inválida. Por favor, intente nuevamente.");
                    break;
            }
        }
    }
}
