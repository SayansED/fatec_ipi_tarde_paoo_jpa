package br.com.eduardo;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.com.eduardo.model.beans.Veiculo;
import br.com.eduardo.model.repository.JPAUtil;

public class AtualizaVeiculo {

	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		transaction.begin();
		
		Veiculo car = manager.find(Veiculo.class, 1L);
		car.setMarca("Chevrolet");
		car.setModelo("Cruze");
		car.setAnoModelo(2020);
		
		transaction.commit();
		
		manager.close();
		JPAUtil.close();
	}

}
