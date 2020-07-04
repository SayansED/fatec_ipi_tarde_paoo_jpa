package br.com.eduardo;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.com.eduardo.model.beans.Usuario;
import br.com.eduardo.model.repository.JPAUtil;

public class TesteInsereUmUsuario {

	public static void main(String[] args) {
		
		//Operação no banco, entity
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		
		Usuario u = new Usuario();
		// insert "implicito" no BD
		u.setNome("Eduardo");
		u.setFone("981249371");
		u.setEmail("edusayans@gmail.com");
		manager.persist(u);
		
		transaction.commit();
		manager.close();
		JPAUtil.close();
	}

}
