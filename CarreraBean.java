package ec.edu.ups.pw.view;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import ec.edu.ups.pw.business.CarreraON;
import ec.edu.ups.pw.business.FacturaON;
import ec.edu.ups.pw.model.Carrera;
import ec.edu.ups.pw.model.DetalleFactura;
import ec.edu.ups.pw.model.Factura;
import ec.edu.ups.pw.model.Persona;
import ec.edu.ups.pw.model.Producto;
import ec.edu.ups.pw.model.Universidad;

@Named
@RequestScoped
/*
 * @SessionScoped se utiliza con el implements
 public class FacturaBean implements serializable { 
 */
public class CarreraBean implements Serializable{
	
	private Carrera newCarrera = new Carrera();
	
	@Inject
	private CarreraON carreraON;
	
	@PostConstruct
	public void init() {
		newCarrera = new Carrera();
		newCarrera.setUniversidad(new Universidad());
	}

	
	public Carrera getNewCarrera() {
		return newCarrera;
	}



	public void setNewCarrera(Carrera newCarrera) {
		this.newCarrera = newCarrera;
	}


	public String doGuardarCarrera() {
		
		carreraON.guardarCarrera(newCarrera);
		return null;
	}
	
	

	
}

	