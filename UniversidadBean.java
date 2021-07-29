package ec.edu.ups.pw.view;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import ec.edu.ups.pw.business.ClienteON;
import ec.edu.ups.pw.business.UniversidadON;
import ec.edu.ups.pw.model.Persona;
import ec.edu.ups.pw.model.Universidad;

@Named
@RequestScoped
public class UniversidadBean implements Serializable {

	private Universidad newUniversidad = new Universidad();
	
	@Inject
	private UniversidadON universidadON;
	
	private List<Universidad> universidades;
	
	@PostConstruct
	public void init() {
		universidades = universidadON.getUniversidades();
		System.out.println(universidades);
	}
	

	public Universidad getNewUniversidad() {
		return newUniversidad;
	}

	public void setNewUniversidad(Universidad newUniversidad) {
		this.newUniversidad = newUniversidad;
	}

	public List<Universidad> getUniversidades() {
		return universidades;
	}


	public void setUniversidades(List<Universidad> universidades) {
		this.universidades = universidades;
	}



	public String guardarUniversidad() throws Exception {
		
		try {
			universidadON.insertarUniversidad(newUniversidad);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	

	
}
