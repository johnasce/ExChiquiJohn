package ec.edu.ups.pw.services;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import ec.edu.ups.pw.business.UniversidadON;
import ec.edu.ups.pw.model.Universidad;
import ec.edu.ups.pw.modelo.*;

@Path("personas")
public class PersonaServiceRS {
	
	@Inject
	private UniversidadON universidadON;
	
	@PUT
	@Path("/registrar")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public String registrarCliente(Universidad universidad) {
		try {
			universidadON.insertarUniversidad(universidad);
			return "OK";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "ERROR";
		}
	}



	@GET
	@Path("universidades")
	@Produces(MediaType.APPLICATION_JSON)
	public List<UniversidadTEMP> getUniversidadTEMPs() {
		List<Universidad> list = universidadON.getUniversidades();
		List<UniversidadTEMP> clientes = new ArrayList<UniversidadTEMP>();

		for (Universidad c : list) {
			UniversidadTEMP pt = new UniversidadTEMP();
			pt.setNombre(c.getNombre());
			pt.setTelefono(c.getTelefono());
			clientes.add(pt);
		}

		return clientes;
	}
}
