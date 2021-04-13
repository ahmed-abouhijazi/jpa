package test;

import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import business.clients;

public class Main {
	public static void main(String[] args) throws SQLException {
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManger = null;
		entityManagerFactory = Persistence.createEntityManagerFactory("GI4");
		System.out.println("je suis la ");
		entityManger = entityManagerFactory.createEntityManager();
		System.out.println("- Lecture de tous les clients --------------------");
		
		List<clients> client = entityManger.createQuery("from clients",clients.class).getResultList();
		
		for(clients clientse :client) {
			System.out.println(clientse);
		}
	}

}
