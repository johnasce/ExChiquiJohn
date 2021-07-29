package ec.edu.ups.pw.business;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.ups.pw.dao.CarreraDAO;
import ec.edu.ups.pw.dao.PersonaDAO;
import ec.edu.ups.pw.dao.UniversidadDAO;
import ec.edu.ups.pw.model.Carrera;
import ec.edu.ups.pw.model.Persona;
import ec.edu.ups.pw.model.Universidad;

@Stateless
public class UniversidadON {
	
	@Inject
	private UniversidadDAO daoUniversidad;
	
	public void insertarUniversidad(Universidad universidad) throws Exception{
		
		daoUniversidad.insert(universidad);
	}
	

	
	public List<Universidad> getUniversidades(){
		return daoUniversidad.getUniversidades("%");
	}
}
