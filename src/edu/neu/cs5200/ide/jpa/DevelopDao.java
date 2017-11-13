package edu.neu.cs5200.ide.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class DevelopDao {
	
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("WeatherApp");
	EntityManager em = null;	
	
	public DeveloperDao(){
		em = factory.createEntityManager();
	}
	
	public void createDeveloper(Developer developer){
		em.getTransaction.begin();
		em.persist(developer);
		em.getTransaction.commit();
	}
	
	public void updateDeveloper(Developer developer, String newLastName){
		em.getTransaction.begin();
		developer.setLast(newLastName);
		em.merge(developer);
		em.getTransaction.commit();
	}
	
	public Developer findDeveloperById(int id){
		em.getTransaction.begin();
		Developer developer = em.find(Developer.class, id);
		em.getTransaction.commit();
		return developer;
	}
	
	public Developer findDeveloperByName(String name){
		em.getTransaction.begin();
		Query q = em.createQuery("select developer from Developer d where d.name = :name");
		q.setParameter("name", name);
		Developer developer  = (developer) q.getSingleResult();
//		List<Developer> developers  = q.getResultList();
		em.getTransaction.commit();
		return developer;
	}
	
	public void removeDeveloperById(int id){
		em.getTransaction.begin();
		Developer developer = em.find(Developer.class, id);
		em.remove(developer);
		em.getTransaction.commit();
	}
	
	public static void main(String[] args){
		DeveloperDao dao = new DeveloperDao();
		Developer d = new Developer("Alice", "Wonderland", "alice@gmail.com");
		dao.createDeveloper(d);
		Developer alice = dao.findDeveloperById(4);
		dao.removeDeveloperById(1);
	}
}
