package com.pedagogy;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
@CrossOrigin(origins="*", maxAge = 3600)
public class PedagogyApplication {

	public static void main(String[] args) {
		SpringApplication.run(PedagogyApplication.class, args);
	}
	
	@EnableWebSecurity
	@Configuration
	public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
		
	    @Override
	    protected void configure(HttpSecurity http) throws Exception {
	        http
	                .authorizeRequests()
	                .antMatchers("/**","/*.js","/*.css","/index.html","*.css","*.js").permitAll()
	                .anyRequest()
	                .fullyAuthenticated()
	                .and()
	                .httpBasic()
	                .and().csrf().disable();
	    }
	    
	}

}