package ec.edu.ups.pw.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ec.edu.ups.pw.model.Carrera;
import ec.edu.ups.pw.model.Persona;


@Stateless
public class CarreraDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	public void insert(Carrera carrera) {
		em.persist(carrera);
		
	}
	
	public void update(Carrera carrera) {
		em.merge(carrera);
	}
	
	public Carrera read(int id) {
		Carrera carrera = em.find(Carrera.class, id);
		return carrera;
	}
	
	public void delete (int id) {
		Carrera carrera = em.find(Carrera.class, id);
		em.remove(carrera);
	}
	
	public List<Carrera> getCarreras(String nombre) {
	
		String jpq2 = "SELECT c FROM Carrera c " 
				+ "WHERE nombre LIKE ?1 ";

		nombre = nombre + "%";
		Query query = em.createQuery(jpq2, Carrera.class);
		query.setParameter(1, nombre);
		
		List<Carrera> carreras = query.getResultList();
		return carreras;
		
	}

}
