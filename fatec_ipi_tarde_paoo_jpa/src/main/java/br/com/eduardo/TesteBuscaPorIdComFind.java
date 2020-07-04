package br.com.eduardo;

import javax.persistence.EntityManager;

import br.com.eduardo.model.beans.Usuario;
import br.com.eduardo.model.repository.JPAUtil;

public class TesteBuscaPorIdComFind {

	public static void main(String[] args) {
		
		// select
		EntityManager manager = JPAUtil.getEntityManager();
		//eager: ansiose, impaciente
		Usuario u = manager.find(Usuario.class, 1L); // caro, faz a busca na hora ao banco

		
		System.out.println(u);
		manager.close();
		JPAUtil.close();
	}

}
