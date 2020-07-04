package br.com.eduardo;

import javax.persistence.EntityManager;

import br.com.eduardo.model.beans.Usuario;
import br.com.eduardo.model.repository.JPAUtil;

public class TesteBuscaPorIdComGetReference {

	public static void main(String[] args) {
		
		EntityManager manager = JPAUtil.getEntityManager();
		// lazy
		Usuario u = manager.getReference(Usuario.class, 1L); // não realiza a busca
		
		System.out.println(u); // busca é disparada nessa linha, agora sim a busca é realizada, quando claramente preciso
		
		manager.close();
		JPAUtil.close();
	}

}
