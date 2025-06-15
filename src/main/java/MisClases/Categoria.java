
package MisClases;

/**
 *
 * @author Leonardo Hurtado
 */
public class Categoria {

    private String categoria_id; 
    private String nombre;      

    
    public Categoria(String categoria_id, String nombre) {
        this.categoria_id = categoria_id;
        this.nombre = nombre;
    }

    public String getCategoria_id() {
        return categoria_id;
    }

    public void setCategoria_id(String categoria_id) {
        this.categoria_id = categoria_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   
}
