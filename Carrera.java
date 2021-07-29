package ec.edu.ups.pw.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Carrera {
	
	@Id
	@GeneratedValue
	private int codigo;
	private String nombre;
	private String director_carrera;
	
	@ManyToOne
	@JoinColumn(name = "codigo_universidad")
	private Universidad universidad;
	
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
	public String getDirector_carrera() {
		return director_carrera;
	}
	public void setDirector_carrera(String director_carrera) {
		this.director_carrera = director_carrera;
	}
	public Universidad getUniversidad() {
		return universidad;
	}
	public void setUniversidad(Universidad universidad) {
		this.universidad = universidad;
	}
	
	
	

}
