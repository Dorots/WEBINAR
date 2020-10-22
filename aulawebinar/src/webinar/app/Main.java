package webinar.app;

import webinar.model.Aluno;
import webinar.model.Endereco;
import webinar.model.Formacao;
import webinar.model.InscricaoSeminario;
import webinar.model.Instrutor;
import webinar.model.Seminario;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import webinar.dao.*;

public class Main {

	public static void main(String[] args) {

		EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();

		/*
		 * Endereco end1 = new Endereco();
		 * 
		 * end1.setRua("rua José"); end1.setCidade("Alfenas");
		 * 
		 * Aluno aluno1 = new Aluno();
		 * 
		 * aluno1.setNome("FOI ?"); aluno1.setMatricula("262982");
		 * aluno1.setEmail("mat.@hotmail"); aluno1.setEmail("@BORA");
		 * aluno1.setEndereco(end1);
		 * 
		 * em.getTransaction().begin(); em.persist(end1); em.persist(aluno1);
		 * em.getTransaction().commit();
		 * 
		 * Aluno aluno2 = new Aluno("1234", "Lucas", new Endereco("Rua 123", "Alfenas"),
		 * "lucas@gmail"); em.getTransaction().begin();
		 * 
		 * em.persist(aluno2); em.getTransaction().commit();
		 * 
		 * Instrutor inst1 = new Instrutor("BATMAN", new Endereco("Rua 123", "Alfenas"),
		 * "lucas@gmail", 1000, Formacao.JEDI); Instrutor inst2 = new
		 * Instrutor("onyTMAN", new Endereco("Rua 123", "Alfenas"), "lucas@gmail", 1000,
		 * Formacao.GRADUADO);
		 * 
		 * em.getTransaction().begin(); em.persist(inst1); em.persist(inst2);
		 * em.getTransaction().commit();
		 * 
		 * List<Instrutor> instrutores = new ArrayList(); instrutores.add(inst1);
		 * instrutores.add(inst2);
		 * 
		 * Seminario semi1 = new Seminario("PAlestra Java", 101, 50, instrutores);
		 * em.getTransaction().begin(); em.persist(semi1); em.getTransaction().commit();
		 * 
		 * Seminario semicon1 = em.find(Seminario.class, 1); Aluno alunocon =
		 * em.find(Aluno.class, 1);
		 * 
		 * InscricaoSeminario inscricaoSeminario = new InscricaoSeminario(alunocon,
		 * semicon1); em.getTransaction().begin(); em.persist(inscricaoSeminario);
		 * em.getTransaction().commit();
		 */

		List<Instrutor> instrutors = new IntrutorDao().getAllbyFormacao(Formacao.JEDI);
		for(Instrutor instrutor :instrutors) {
		System.out.println(instrutor.getNome());
		JPAUtil.shutdown();
		}
	}

}
