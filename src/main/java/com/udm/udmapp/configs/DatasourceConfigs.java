package com.udm.udmapp.configs;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories(basePackages = { "com.udm.udmapp.domain.repositories" })
@EnableTransactionManagement
public class DatasourceConfigs {

	private static final String ENTITIES_PACKAGE = "com.udm.udmapp.domain.entities";

	private static final String PERSISTENCE_UNIT_NAME = "UDMAPP_PERSISTENCE_UNIT";

	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource dataSource) {

		LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();

		entityManagerFactoryBean.setDataSource(dataSource);
		entityManagerFactoryBean.setPackagesToScan(ENTITIES_PACKAGE);

		HibernateJpaVendorAdapter hibernateJpaVendorAdapter = new HibernateJpaVendorAdapter();

		hibernateJpaVendorAdapter.setDatabase(Database.MYSQL);
		hibernateJpaVendorAdapter.setGenerateDdl(true);
		hibernateJpaVendorAdapter.setShowSql(true);

		entityManagerFactoryBean.setJpaVendorAdapter(hibernateJpaVendorAdapter);

		entityManagerFactoryBean.setPersistenceUnitName(PERSISTENCE_UNIT_NAME);

		return entityManagerFactoryBean;
	}

	@Bean
	public PlatformTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {
		return new JpaTransactionManager(entityManagerFactory);
	}
}
