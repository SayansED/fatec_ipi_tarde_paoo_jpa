package br.com.eduardo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.eduardo.model.beans.Usuario;
import br.com.eduardo.model.repository.JPAUtil;

public class TesteListaTodosJPQL {

	public static void main(String[] args) {
		
		EntityManager manager = JPAUtil.getEntityManager();
		Query query = manager.createQuery("from Usuario"); // busca todos
		List <Usuario> usuarios = query.getResultList();
		for (Usuario u: usuarios) {
			System.out.println(u);
		}
		
		manager.close();
		JPAUtil.close();
	}

}
