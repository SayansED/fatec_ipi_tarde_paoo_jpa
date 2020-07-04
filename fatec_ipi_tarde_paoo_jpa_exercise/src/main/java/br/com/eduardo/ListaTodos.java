package br.com.eduardo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.eduardo.model.beans.Veiculo;
import br.com.eduardo.model.repository.JPAUtil;

public class ListaTodos {

	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		Query query = manager.createQuery("from Veiculo");
		List <Veiculo> cars = query.getResultList();
		for (Veiculo car: cars) {
			System.out.println(car);
		}
		manager.close();
		JPAUtil.close();
	}

}
