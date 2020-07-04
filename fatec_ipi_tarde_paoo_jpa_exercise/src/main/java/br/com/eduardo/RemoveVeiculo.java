package br.com.eduardo;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.com.eduardo.model.beans.Veiculo;
import br.com.eduardo.model.repository.JPAUtil;

public class RemoveVeiculo {

	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		transaction.begin();
		Veiculo car = manager.find(Veiculo.class, 1L);
		manager.remove(car);
		
		transaction.commit();
		manager.close();
		JPAUtil.close();
	}

}
