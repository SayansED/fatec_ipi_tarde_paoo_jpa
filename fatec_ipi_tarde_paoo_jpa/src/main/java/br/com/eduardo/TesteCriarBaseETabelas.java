package br.com.eduardo;

import javax.persistence.Persistence;

public class TesteCriarBaseETabelas {
	
	public static void main(String[] args) {
		// Fabricar conexões, sobre essa configuração especificado nesse nome
		Persistence.createEntityManagerFactory("bossiniPU");
	}
}
