package cl.vrol.vrolsite.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import cl.vrol.vrolsite.dao.UsuarioDao;
import cl.vrol.vrolsite.dao.impl.UsuarioDaoImpl;

@Configuration
@ComponentScan(basePackages="cl.vrol.vrolsite")
@EnableWebMvc
public class MvcConfiguration implements WebMvcConfigurer {

	@Bean
	public void configureViewResolvers(ViewResolverRegistry registry){
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		resolver.setViewNames("*");
		InternalResourceViewResolver resolverGames = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/juegos/");
		resolver.setSuffix(".jsp");
		resolver.setViewNames("*");
		
		registry.viewResolver(resolver);
        registry.viewResolver(resolverGames);
	}
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	}

	@Bean
	public DriverManagerDataSource getDataSource() {

		DriverManagerDataSource bds = new DriverManagerDataSource();
		bds.setDriverClassName("com.mysql.jdbc.Driver");
		bds.setUrl("jdbc:mysql://localhost:3306/vrolbd");
		bds.setUsername("root");
		bds.setPassword("Larcon90");

		return bds;
	}
	
	@Bean
	public UsuarioDao getUsuarioDao() {
		return new UsuarioDaoImpl(getDataSource());
	}
}
