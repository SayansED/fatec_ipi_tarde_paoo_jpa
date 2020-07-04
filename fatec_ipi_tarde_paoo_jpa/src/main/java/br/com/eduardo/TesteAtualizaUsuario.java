package br.com.eduardo;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.com.eduardo.model.beans.Usuario;
import br.com.eduardo.model.repository.JPAUtil;

public class TesteAtualizaUsuario {

	public static void main(String[] args) {
		
		EntityManager manager = JPAUtil.getEntityManager();
		// Preciso de uma transação, pq preciso alterar a base
		EntityTransaction transaction = manager.getTransaction();
		
		transaction.begin();
		
		Usuario u = manager.find(Usuario.class, 1L);
		u.setNome(u.getNome() + " Sayans");
		u.setEmail("du_sayans@hotmail.com");
		
		transaction.commit();
		
		manager.close();
		JPAUtil.close();
	}

}
