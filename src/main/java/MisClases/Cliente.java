/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MisClases;

/**
 *
 * @author mindu
 */
public class Cliente {

    private int clienteId;
    private String nombre;
    private String contrasena;
    private String direccion;
    private String email;

    public Cliente(int clienteId, String nombre, String contrasena, String direccion, String email) {
        this.clienteId = clienteId;
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.direccion = direccion;
        this.email = email;
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Metodos
    public void crearCuenta() {
        if (nombre == null || nombre.isEmpty()
                || contrasena == null || contrasena.isEmpty()
                || email == null || email.isEmpty()) {
            System.out.println("Error: Datos incompletos. No se puede crear la cuenta.");
        } else {
            // Aquí se simularía el guardado en una lista o base de datos
            System.out.println("Cuenta creada exitosamente para: " + nombre);
        }
    }

    public void login(String contrasenaIngresada) {
        if (contrasena == null) {
            System.out.println("Error: La cuenta no tiene contraseña registrada.");
            return;
        }

        if (this.contrasena.equals(contrasenaIngresada)) {
            System.out.println("Login exitoso para: " + nombre);
        } else {
            System.out.println("Contraseña incorrecta.");
        }
    }

    public void buscarProducto(String producto) {
        String[] productosDisponibles = {"PlayStation 5", "Xbox Series X", "Nintendo Switch", "PC Gamer"};

        boolean encontrado = false;
        for (String p : productosDisponibles) {
            if (p.toLowerCase().contains(producto.toLowerCase())) {
                System.out.println("Producto encontrado: " + p);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("Producto no encontrado: " + producto);
        }
    }

    public void verProductos() {
        String[] productosDisponibles = {"PlayStation 5", "Xbox Series X", "Nintendo Switch", "PC Gamer"};

        System.out.println("Mostrando productos disponibles:");
        for (String producto : productosDisponibles) {
            System.out.println("- " + producto);
        }
    }

}
