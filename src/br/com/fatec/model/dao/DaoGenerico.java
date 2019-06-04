package br.com.fatec.model.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.fatec.config.HibernateConfig;

public class DaoGenerico {
	
	public static <T> void salvar(T entidade) {
		Transaction transaction = null;
		
		try(Session session = HibernateConfig.getSessionFactory().openSession()){
			transaction = session.getTransaction();
			transaction.begin();
			
			session.save(entidade);
			
			transaction.commit();
			session.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("unchecked")
	public <T> List<T> listarTodos(Class<T> entidade) {
		Transaction transaction = null;
		try (Session session = HibernateConfig.getSessionFactory().openSession()){
			List<T> entidades;
			
			transaction = session.getTransaction();
			transaction.begin();
			
			
			entidades = session.createQuery("FROM "+entidade.getName()).getResultList();
			
			transaction.commit();
			session.close();

			return entidades;
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
