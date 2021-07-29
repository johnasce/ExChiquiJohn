package ec.edu.ups.pw.business;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.ups.pw.dao.CarreraDAO;
import ec.edu.ups.pw.dao.FacturaDAO;
import ec.edu.ups.pw.dao.PersonaDAO;
import ec.edu.ups.pw.dao.ProductosDao;
import ec.edu.ups.pw.dao.UniversidadDAO;
import ec.edu.ups.pw.model.Carrera;
import ec.edu.ups.pw.model.Factura;
import ec.edu.ups.pw.model.Persona;
import ec.edu.ups.pw.model.Producto;


@Stateless
public class CarreraON {
	
	@Inject
	private CarreraDAO daoCarrerra;

	
	
	public void guardarCarrera(Carrera carrera) {
		
		daoCarrerra.insert(carrera);
	}
	public Carrera getCarrera(int id) {
		
		Carrera carrera = daoCarrerra.read(id);
		return carrera;
	}
	
	
	
}
