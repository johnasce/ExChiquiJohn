package ec.edu.ups.pw.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Universidad {
	
	@Id
	@GeneratedValue
	@Column(name = "codigo_universidad")
	private int codigo;
	private String nombre;
	private String direccion;
	private String telefono;
	
	@OneToMany(mappedBy = "universidad", cascade = CascadeType.ALL)
	private List<Carrera> carreras = new ArrayList<Carrera>();
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public List<Carrera> getCarreras() {
		return carreras;
	}
	public void setCarreras(List<Carrera> carreras) {
		this.carreras = carreras;
	}
	
	
}
