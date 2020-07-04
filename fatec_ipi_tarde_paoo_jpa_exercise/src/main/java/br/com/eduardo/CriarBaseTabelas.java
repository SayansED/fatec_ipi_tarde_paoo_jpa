package br.com.eduardo;

import javax.persistence.Persistence;

public class CriarBaseTabelas {

	public static void main(String[] args) {
		Persistence.createEntityManagerFactory("eduardoPU");
		
	}

}
