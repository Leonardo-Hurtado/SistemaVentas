/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MisClases;

/**
 *
 * @author mindu
 */
public class Pedido {

    private String pedido_id;
    private String direccion;
    private String metodo_pago;
    private double precio_total;
    private String estado_entrega;
    private String cliente_id;
    private String carrito_id;

    public Pedido(String pedido_id, String direccion, String metodo_pago, double precio_total,
            String estado_entrega, String cliente_id, String carrito_id) {
        this.pedido_id = pedido_id;
        this.direccion = direccion;
        this.metodo_pago = metodo_pago;
        this.precio_total = precio_total;
        this.estado_entrega = estado_entrega;
        this.cliente_id = cliente_id;
        this.carrito_id = carrito_id;
    }

    public String getPedido_id() {
        return pedido_id;
    }

    public void setPedido_id(String pedido_id) {
        this.pedido_id = pedido_id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getMetodo_pago() {
        return metodo_pago;
    }

    public void setMetodo_pago(String metodo_pago) {
        this.metodo_pago = metodo_pago;
    }

    public double getPrecio_total() {
        return precio_total;
    }

    public void setPrecio_total(double precio_total) {
        this.precio_total = precio_total;
    }

    public String getEstado_entrega() {
        return estado_entrega;
    }

    public void setEstado_entrega(String estado_entrega) {
        this.estado_entrega = estado_entrega;
    }

    public String getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(String cliente_id) {
        this.cliente_id = cliente_id;
    }

    public String getCarrito_id() {
        return carrito_id;
    }

    public void setCarrito_id(String carrito_id) {
        this.carrito_id = carrito_id;
    }

    public void GenerarRecibo() {
        System.out.println("===== RECIBO DE PEDIDO =====");
        System.out.println("ID Pedido: " + pedido_id);
        System.out.println("Cliente ID: " + cliente_id);
        System.out.println("Dirección de entrega: " + direccion);
        System.out.println("Método de pago: " + metodo_pago);
        System.out.println("Total a pagar: $" + precio_total);
        System.out.println("Estado actual: " + estado_entrega);
        System.out.println("ID Carrito: " + carrito_id);
        System.out.println("=============================");
    }

    public void CambiarEstado(String nuevoEstado) {
        String estadoAnterior = this.estado_entrega;
        this.estado_entrega = nuevoEstado;
        System.out.println("Estado del pedido " + pedido_id + " cambiado de '" + estadoAnterior + "' a: '" + nuevoEstado + "'");
        NotificarCambioEstado(); // Notificar automáticamente
    }

    public String VerEstado() {
        System.out.println("Estado actual del pedido " + pedido_id + ": " + estado_entrega);
        return estado_entrega;
    }

    public void NotificarCambioEstado() {
        System.out.println("🔔 Notificación enviada al cliente " + cliente_id + ": El estado de tu pedido '" + pedido_id + "' ha sido actualizado a '" + estado_entrega + "'");
    }

    @Override
    public String toString() {
        return "\n===== Detalles del Pedido ====="
                + "\nID Pedido     : " + pedido_id
                + "\nCliente ID    : " + cliente_id
                + "\nCarrito ID    : " + carrito_id
                + "\nDirección     : " + direccion
                + "\nMétodo de Pago: " + metodo_pago
                + "\nPrecio Total  : $" + precio_total
                + "\nEstado Entrega: " + estado_entrega
                + "\n===============================";
    }

}
