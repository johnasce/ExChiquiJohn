package ec.edu.ups.pw.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ec.edu.ups.pw.model.Factura;
import ec.edu.ups.pw.model.Universidad;



@Stateless
public class UniversidadDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	public void insert(Universidad universidad) {
		em.persist(universidad);
		
	}
	
	public void update(Universidad universidad) {
		em.merge(universidad);
	}
	
	public Universidad read(int id) {
		Universidad universidad = em.find(Universidad.class, id);
		return universidad;
	}
	
	public void delete (int id) {
		Universidad universidad = em.find(Universidad.class, id);
		em.remove(universidad);
	}
	
	public List<Universidad> getUniversidades(String nombre) {
	

		String jpq2 = "SELECT f FROM Universidad f " ;
		Query query = em.createQuery(jpq2, Universidad.class);
		
		List<Universidad> universidad = query.getResultList();
		return universidad;
		
	}
}
