package br.com.fatec.model.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.fatec.config.aplicacao.EntidadeDominio;
import br.com.fatec.config.hibernate.HibernateConfig;
import br.com.fatec.config.patterns.IDao;

public class DaoGenerico implements IDao{
	
	@Override
	public <T> void salva(EntidadeDominio entidade){
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
	
	@Override
	@SuppressWarnings("unchecked")
	public <T> List<T> listarTodos(Class<T> entidade) {
		Transaction transaction = null;
		try (Session session = HibernateConfig.getSessionFactory().openSession()){
			List<T> entidades;
			
			transaction = session.getTransaction();
			transaction.begin();
			
			entidades = session.createQuery("FROM "+entidade.getClass()).getResultList();
			
			transaction.commit();
			session.close();

			return entidades;
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public <T> void atualiza(T entidade) {
		Transaction transaction = null;
		
		try(Session session = HibernateConfig.getSessionFactory().openSession()){
			transaction = session.getTransaction();
			transaction.begin();
			
			session.update(entidade);
			
			transaction.commit();
			session.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public <T> void exclui(T entidade) {
		Transaction transaction = null;
		
		try(Session session = HibernateConfig.getSessionFactory().openSession()){
			transaction = session.getTransaction();
			transaction.begin();
			
			session.remove(entidade);
			
			transaction.commit();
			session.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public <T> T buscarPorId(int id, Class<T> entidade) {
		return null;
	}
}
