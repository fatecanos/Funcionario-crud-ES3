package br.com.fatec.config;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

public class HibernateConfig {
	private static SessionFactory sessionFactory;
	protected static final String BANCO = "bdFuncionario";
	protected static final String SENHA = "";
	
    public static SessionFactory getSessionFactory() {
    	
        if (sessionFactory == null) {
            try {
                Configuration configuration = new Configuration();

                Properties settings = new Properties();
                settings.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
                settings.put(Environment.URL, 	 "jdbc:mysql://localhost:3306/"+ BANCO +"?serverTimezone=UTC");
                settings.put(Environment.USER, 	 "root");
                settings.put(Environment.PASS, 	 SENHA);          
                settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");//what is it?
                settings.put(Environment.SHOW_SQL, "true");
                settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread"); 
                settings.put(Environment.HBM2DDL_AUTO, "create-drop"); //which are actions that it avaliable?

                configuration.setProperties(settings);

                //CLASSES ENTIDADE
                
                ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                    .applySettings(configuration.getProperties()).build();

                sessionFactory = configuration.buildSessionFactory(serviceRegistry);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return sessionFactory;
    }
}
