package com.musa1.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
@Configuration
@EnableWebSecurity
public class SeguridadConfig extends WebSecurityConfigurerAdapter{
	@Autowired
	private UserLogin userLogin;
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
		return bCryptPasswordEncoder;
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
		auth.userDetailsService(userLogin).passwordEncoder(passwordEncoder);
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		http
		.csrf().disable()
		.authorizeRequests()
		.antMatchers("/usuarios/**").permitAll()
		.antMatchers("/roles/**").permitAll()
		.antMatchers("/ubigeos/**").permitAll()
		.antMatchers("/persona/**").permitAll()
		.anyRequest()
		.authenticated()
		.and()
        .formLogin().loginPage("/login").permitAll()
        .and()
        .logout().permitAll()
		.and()
		.httpBasic();		
	}
}*/

