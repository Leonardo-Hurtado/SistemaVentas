
package MisClases;

/**
 *
 * @author Leonardo Hurtado
 */
public class Admin {
    private String admin_id;
    private String email;
    private String contraseña;

    public Admin(String admin_id, String email, String contraseña) {
        this.admin_id = admin_id;
        this.email = email;
        this.contraseña = contraseña;
    }

    public String getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(String admin_id) {
        this.admin_id = admin_id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void CrearCuenta() {
        if (admin_id == null || admin_id.isEmpty() ||
                email == null || email.isEmpty() ||
                contraseña == null || contraseña.isEmpty()) {
            System.out.println("Error: Datos incompletos. No se puede crear la cuenta de administrador.");
        } else {
            // Simulación de guardar cuenta
            System.out.println("✅ Cuenta de administrador creada exitosamente para: " + email);
        }
    }

    public void Login(String contraseñaIngresada) {
        if (this.contraseña.equals(contraseñaIngresada)) {
            System.out.println("🔓 Login exitoso para el administrador: " + email);
        } else {
            System.out.println("❌ Contraseña incorrecta para el administrador: " + email);
        }
    }

    public void GestionarProducto() {
        System.out.println("📦 Gestión de productos:");
        System.out.println("- Puedes agregar, editar o eliminar productos.");
        System.out.println("Producto agregado: 'Control PS5'");
        System.out.println("Producto editado: 'Nintendo Switch OLED'");
        System.out.println("Producto eliminado: 'Juego FIFA 22'");
    }

    public void GestionarPedido() {
        System.out.println("📋 Gestión de pedidos:");
        System.out.println("- Revisando pedidos pendientes...");
        System.out.println("- Pedido #PED1001 marcado como 'Enviado'.");
        System.out.println("- Pedido #PED1002 marcado como 'Entregado'.");
        System.out.println("- Pedido #PED1003 cancelado por el cliente.");
    }
}
