/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ec.edu.ups.practicaestructura1tienda.modelo;
import java.util.Objects;

/**
 *
 * @author casa
 */

public class Producto<T> {
    // Atributos de la clase Producto
    private String nombre;
    private T codigo;
    private double precio;
    private int cantidadDisponible;

    // Constructor donde se instancian los atributos de la clase 
    public Producto(String nombre, T codigo, double precio, int cantidadDisponible) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
        this.cantidadDisponible = cantidadDisponible;
    }

    // Getter y Setter de los atributos
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public T getCodigo() {
        return codigo;
    }
    public void setCodigo(T codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }
    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }
    

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 11 * hash + Objects.hashCode(this.codigo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Producto<?> other = (Producto<?>) obj;
        return Objects.equals(this.codigo, other.codigo);
    }
    
}
