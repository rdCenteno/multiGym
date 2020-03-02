package multigym.gym.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
public class Usuario {
	
	private String roles;
	private long id;
	private String nombre;
	private String apellidos;
	private String password;
	private byte enabled;
	
	private List<Sala> salas = new ArrayList<Sala>();
	private List<Mensajes> mensajes = new ArrayList<Mensajes>();

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getId() {
		return id;
	}

	public void setId(final long id) {
		this.id = id;
	}

	@ManyToMany(targetEntity = Sala.class, mappedBy = "salas")
	public List<Sala> getSalas() {
		return salas;
	}

	public void setSalas(final List<Sala> sala) {
		this.salas = sala;
    }
    @ManyToMany(targetEntity=Mensajes.class, mappedBy="mensajes")
    public List<Mensajes> getMensajes() {
		return mensajes;
	}
	public void setMensaje(final List<Mensajes> mensaje) {
		this.mensajes = mensaje;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(final String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(final String apellidos) {
		this.apellidos = apellidos;
	}
	@Override
	public String toString() {
		return "User #" + id;
	}

	public byte getEnabled() {
		return enabled;
	}

	public void setEnabled(byte enabled) {
		this.enabled = enabled;
	}

	public String getRoles() {
		return roles;
	}

	public void setRoles(String roles) {
		this.roles = roles;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
