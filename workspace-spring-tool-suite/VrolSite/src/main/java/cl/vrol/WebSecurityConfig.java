package cl.vrol;



import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.SecurityBuilder;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
public class WebSecurityConfig   {

	@Autowired
	private DataSource dataSource;
	
	@Autowired
	private BCryptPasswordEncoder passEncoder;
	
	
	@Autowired
	public void configurerSecurityGlobal(AuthenticationManagerBuilder builder) throws Exception{
		builder.jdbcAuthentication()
		.dataSource(dataSource)
		.passwordEncoder(passEncoder)
		.usersByUsernameQuery("SELECT username, password, enabled FROM users WHERE username=?")
		.authoritiesByUsernameQuery("SELECT u.username, r.rol FROM roles r INNER JOIN users u ON r.user_id=u.id WHERE u.username=?;");
	}

	@Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
        	.authorizeRequests().antMatchers("/", "/css/**","/img/**","/js/**","/Caledario/",
				"/views/contacto/**","/views/juegos/**","/views/jugadores/nuevoinscrito",
				"/views/jugadores/inscribir","/Juntas/","/mesas/","/mesas/ver/**").permitAll()
		.antMatchers("/mesas/**", "/views/jugadores/**").hasAnyRole("USER")
		.antMatchers("/mesas/**", "/views/jugadores/**").hasAnyRole("ADMIN")
		.anyRequest().authenticated();
        return http.build();
    }

	
}
