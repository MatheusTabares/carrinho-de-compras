package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa(null, "Matheus Tabares", "tabares.lopes@gmail.com");
		Pessoa p2 = new Pessoa(null, "Caroline Martins", "tabares.martins@hotmail.com");
		Pessoa p3 = new Pessoa(null, "Sonia Ferreira", "sonia.ferreira@gmail.com");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		/**
		 * INSERE
		 */
		/*em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit();
		System.out.println("PRONTO");*/
		
		/**
		 * BUSCA
		 */
		/*Pessoa p = em.find(Pessoa.class, 2);
		System.out.println(p);*/
		
		/**
		 * EXCLUI
		 * OBS: Para excluir do banco tem que ser obrigatóriamente uma entidade monitorada, ou seja,
		 * o retorno de uma busca do banco de dados ou acabado de te-la inserida.
		 */
		Pessoa p = em.find(Pessoa.class, 2);
		em.getTransaction().begin();
		em.remove(p);
		em.getTransaction().commit();
		
		/**
		 * FECHA CONCEXÃO
		 */
		em.close();
		emf.close();
	}
}
