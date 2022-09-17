package com.raven.mvcwebapp.configuration;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.raven.mvcwebapp")
public class ApplicationConfiguration {

	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver resourceViewResolver = new InternalResourceViewResolver();
		resourceViewResolver.setPrefix("/WEB-INF/view/");
		resourceViewResolver.setSuffix(".jsp");

		return resourceViewResolver;
	}

//	@Bean(name = "jdbcDataSource")
//	public DataSource getJdbcDataSource() {
//		BasicDataSource jdbcDataSource = new BasicDataSource();
//
//		try {
//			jdbcDataSource.setDriverClassName(environment.getProperty("jdbc.driver"));
//			jdbcDataSource.setUrl(environment.getProperty("jdbc.url"));
//			jdbcDataSource.setUsername(environment.getProperty("jdbc.user"));
//			jdbcDataSource.setPassword(environment.getProperty("jdbc.password"));
//
//			jdbcDataSource.setInitialSize(Integer.parseInt(environment.getProperty("dbcp2.initial-size")));
//			jdbcDataSource.setMaxIdle(Integer.parseInt(environment.getProperty("dbcp2.max-idle")));
//			jdbcDataSource
//					.setDefaultQueryTimeout(Integer.parseInt(environment.getProperty("dbcp2.default-query-timeout")));
//			jdbcDataSource.setDefaultAutoCommit(Boolean.valueOf(environment.getProperty("dbcp2.default-auto-commit")));
//
////			System.out.println("----->>>>>>> User Name -->> " + jdbcDataSource.getUsername());
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//		return jdbcDataSource;
//	}
//
//	private Properties getHibernateProperties() {
//
//		// set hibernate properties
//		Properties props = new Properties();
//
//		props.setProperty("hibernate.dialect", environment.getProperty("hibernate.dialect"));
//		props.setProperty("hibernate.show_sql", environment.getProperty("hibernate.show_sql"));
//
//		return props;
//	}
//
//	@Bean
//	public LocalSessionFactoryBean sessionFactory() {
//
//		// create session factorys
//		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
//
//		// set the properties
//		sessionFactory.setDataSource(getJdbcDataSource());
//		sessionFactory.setPackagesToScan(environment.getProperty("hiberante.packagesToScan"));
//		sessionFactory.setHibernateProperties(getHibernateProperties());
//
//		return sessionFactory;
//	}
//
//	@Bean
//	@Autowired
//	public HibernateTransactionManager transactionManager(SessionFactory sessionFactory) {
//
//		// setup transaction manager based on session factory
//		HibernateTransactionManager txManager = new HibernateTransactionManager();
//		txManager.setSessionFactory(sessionFactory);
//
//		return txManager;
//	}
}
