
package MisClases;

/**
 *
 * @author Leonardo Hurtado
 */
public class Carrito {

    private String carrito_id;
    private int cantidad;
    private String producto_id;
    private String cliente_id;

    public Carrito(String carrito_id, int cantidad, String producto_id, String cliente_id) {
        this.carrito_id = carrito_id;
        this.cantidad = cantidad;
        this.producto_id = producto_id;
        this.cliente_id = cliente_id;
    }

    public String getCarrito_id() {
        return carrito_id;
    }

    public void setCarrito_id(String carrito_id) {
        this.carrito_id = carrito_id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getProducto_id() {
        return producto_id;
    }

    public void setProducto_id(String producto_id) {
        this.producto_id = producto_id;
    }

    public String getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(String cliente_id) {
        this.cliente_id = cliente_id;
    }

    public void AñadirProducto(int cantidadAgregada) {
        this.cantidad += cantidadAgregada;
        System.out.println("🛒 Producto " + producto_id + " añadido al carrito de " + cliente_id);
        System.out.println("Cantidad actual en carrito: " + this.cantidad);
    }

    public void QuitarProducto(int cantidadRemovida) {
        if (cantidadRemovida <= this.cantidad) {
            this.cantidad -= cantidadRemovida;
            System.out.println("❌ Producto " + producto_id + " quitado del carrito");
            System.out.println("Cantidad restante: " + this.cantidad);
        } else {
            System.out.println("⚠️ No se puede quitar más productos de los que hay en el carrito.");
        }
    }

    public void RealizarPedido() {
        if (cantidad > 0) {
            System.out.println("✅ Pedido realizado con éxito para el cliente " + cliente_id);
            System.out.println("Producto: " + producto_id + " | Cantidad: " + cantidad);
            cantidad = 0;
        } else {
            System.out.println("❌ El carrito está vacío. No se puede realizar el pedido.");
        }
    }

    public void mostrarCarrito() {
        System.out.println("🧾 Carrito ID: " + carrito_id);
        System.out.println("Cliente ID: " + cliente_id);
        System.out.println("Producto ID: " + producto_id);
        System.out.println("Cantidad: " + cantidad);
    }
}
