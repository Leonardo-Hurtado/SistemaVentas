/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MisClases;


public class Producto {

    private String producto_id;
    private String nombre;
    private String descripcion;
    private double precio;
    private boolean disponibilidad;
    private String categoria_id;

    public Producto(String producto_id, String nombre, String descripcion, double precio, boolean disponibilidad, String categoria_id) {
        this.producto_id = producto_id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.disponibilidad = disponibilidad;
        this.categoria_id = categoria_id;
    }

    // Getters and Setters
    public String getProducto_id() {
        return producto_id;
    }

    public void setProducto_id(String producto_id) {
        this.producto_id = producto_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getCategoria_id() {
        return categoria_id;
    }

    public void setCategoria_id(String categoria_id) {
        this.categoria_id = categoria_id;
    }

     public void Agregar() {
        System.out.println("✅ Producto agregado:");
        mostrarInformacion();
    }

    public void Editar(String nuevoNombre, String nuevaDescripcion, double nuevoPrecio, boolean nuevaDisponibilidad) {
        this.nombre = nuevoNombre;
        this.descripcion = nuevaDescripcion;
        this.precio = nuevoPrecio;
        this.disponibilidad = nuevaDisponibilidad;

        System.out.println("✏️ Producto editado:");
        mostrarInformacion();
    }

     public void Eliminar() {
        System.out.println("🗑️ Producto eliminado: " + producto_id + " - " + nombre);
    }


   public void Buscar(String texto) {
        if (nombre.toLowerCase().indexOf(texto.toLowerCase()) >= 0) {
            System.out.println("🔍 Producto encontrado:");
            mostrarInformacion();
        } else {
            System.out.println("❌ No se encontró un producto que coincida con: " + texto);
        }
    }
   
       public void mostrarInformacion() {
        System.out.println("ID: " + producto_id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Precio: $" + precio);
        System.out.println("Disponible: " + (disponibilidad ? "Sí" : "No"));
        System.out.println("Categoría: " + categoria_id);
    }
   

}
