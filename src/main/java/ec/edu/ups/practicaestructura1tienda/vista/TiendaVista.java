/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ec.edu.ups.practicaestructura1tienda.vista;
import ec.edu.ups.practicaestructura1tienda.modelo.Producto;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author casa
 */

public class TiendaVista<T> {
    // Metodo para mostrar  el menu principal
    public void mostrarMenu() {
        System.out.println("------------- MENÚ PRINCIPAL --------------");
        System.out.println("\n 1. Agregar producto al inventario \n2. Realizar venta \n 3. Consultar inventario \n 4. Salir");
        System.out.print("Ingrese una opción: ");
    }

    // Metodo donde se pide los datos mediante la consola
    public Producto<T> solicitarDatosProducto() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del producto: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el código del producto: ");
        T codigo = (T) scanner.next();
        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();
        System.out.print("Ingrese la cantidad disponible del producto: ");
        int cantidad = scanner.nextInt();
        return new Producto<>(nombre, codigo, precio, cantidad);
    }

    // Metodo para solicitar el codigo mediante el scanner 
    public T solicitarCodigoProducto() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el código del producto: ");
        return (T) scanner.next();
    }

    // Metodo para solicitar la cantidad de ventas 
    public int solicitarCantidadVenta() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad a vender: ");
        return scanner.nextInt();
    }

    // Metodo que me muestra el inventario en consola
    public void mostrarInventario(List<Producto<T>> inventario) {
        System.out.println("------------- INVETARIO ---------------");
        for (Producto<T> producto : inventario) {
            System.out.println("Nombre: " + producto.getNombre()+ "Código: " + producto.getCodigo() + "Precio: " + producto.getPrecio() + "Cantidad disponible: " + producto.getCantidadDisponible());
        }
    }

    // Metodo para mostrar un mensaje
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
