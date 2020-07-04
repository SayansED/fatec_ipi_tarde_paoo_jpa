package br.com.eduardo.model.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

// Operações de persistencia 
public class JPAUtil {
	
	private static EntityManagerFactory factory;
	
	static {
		// salva na memoria
		factory = Persistence.createEntityManagerFactory("bossiniPU");
	}
	
	public static EntityManager getEntityManager () {
		return factory.createEntityManager();
	}
	
	public static void close () {
		factory.close();
	}

}
