package com.goutham.nelliBackend.config;

import java.util.Properties;

import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages = {"com.goutham.nelliBackend.dto"})
@EnableTransactionManagement
public class HibernateConfig {

	// Change the below based on the DBMS you choose
	// private final static String DATABASE_URL="jdbc:mysql://localhost/nellai";
	private final static String DATABASE_DRIVER = "com.mysql.jdbc.Driver";
	private final static String DATABASE_DIALECT = "org.hibernate.dialect.MySQLDialect";
	private final static String DATABASE_USERNAME = "root";
	// private final static String DATABASE_PASSWORD="root";
	private final static String DATABASE_URL = "jdbc:mysql://aal86asxsax2cj.cfkfj4tmdu33.ap-south-1.rds.amazonaws.com:3306/nellai";
	private final static String DATABASE_PASSWORD = "nellai78";
	
	//private final static String DATABASE_URL="jdbc:mysql://aahd2pv8crkz4b.ck8f4dvagf4o.ap-south-1.rds.amazonaws.com:3306/nellai";
	//private final static String DATABASE_PASSWORD="912Krishna09";

	// dataSource bean will be available
	@Bean("dataSource")
	public DataSource getDataSource() {

		BasicDataSource dataSource = new BasicDataSource();
		// String DB_URl = System.getProperty("JDBC_Connection_String");
		// System.out.println("DB_URl"+DB_URl);
		// Providing the database connection information
		dataSource.setDriverClassName(DATABASE_DRIVER);
		dataSource.setUrl(DATABASE_URL);
		dataSource.setUsername(DATABASE_USERNAME);
		dataSource.setPassword(DATABASE_PASSWORD);
		// dataSource.setUrl(DB_URl);

		return dataSource;

	}

	// sessionFactory bean will be available

	@Bean
	public SessionFactory getSessionFactory(DataSource dataSource) {

		LocalSessionFactoryBuilder builder = new LocalSessionFactoryBuilder(dataSource);

		builder.addProperties(getHibernateProperties());
		builder.scanPackages("com.goutham.nelliBackend.dto");

		return builder.buildSessionFactory();

	}

	// All the hibernate properties will be returned in this method
	private Properties getHibernateProperties() {

		Properties properties = new Properties();

		properties.put("hibernate.dialect", DATABASE_DIALECT);
		properties.put("hibernate.show_sql", "true");
		properties.put("hibernate.format_sql", "true");
		properties.put("hibernate.hbm2ddl.auto", "update");

		return properties;
	}

	// transactionManager bean
	@Bean
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory) {
		HibernateTransactionManager transactionManager = new HibernateTransactionManager(sessionFactory);
		return transactionManager;
	}

}
