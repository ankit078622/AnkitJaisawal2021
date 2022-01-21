package com.org.espire.spring.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.org.espire.spring.filter.JWTAuthenticationFilter;
import com.org.espire.spring.filter.JWTAuthorizationFilter;
import com.org.espire.spring.service.AuthenticationEmployeeDetailService;

@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	@Autowired
	private AuthenticationEmployeeDetailService authenticationEmployeeDetailService;

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.cors().and().csrf().disable().authorizeRequests()

				// allowing to access our register API endpoint without authentication
				.antMatchers(HttpMethod.POST, AuthenticationConstant.SIGN_UP_URL).permitAll()
				//.antMatchers(HttpMethod.GET, AuthenticationConstant.SIGN_UP_TEST_URL).permitAll()
				// This will authenticate each request coming to our API
				.anyRequest().authenticated().and()
				.httpBasic();
//				// Introducing authentication filter
//				.addFilter(new JWTAuthenticationFilter(authenticationManager()))
//				// Introducing authorization filter
//				.addFilter(new JWTAuthorizationFilter(authenticationManager()))
//
//				.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
	}

	// allow authentication manager to authenticate
	// user details service implementation with password encoder
	@Override
	public void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(authenticationEmployeeDetailService).passwordEncoder(bCryptPasswordEncoder);
	}
}
