
package mx.itson.CitasMedicas.entities;

/**
 *
 * @author Diego M
 */
public class user {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTipo_usuario() {
        return tipo_u;
    }

    public void setTipo_usuario(String tipo_u) {
        this.tipo_u = tipo_u;
    }
    private int id;
    private String nombre;
    private String email;
    private String password;
    private String tipo_u;

    public String getTipo_u() {
        return tipo_u;
    }

    public void setTipo_u(String tipo_u) {
        this.tipo_u = tipo_u;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
    private String edad;
    
    
    
}
