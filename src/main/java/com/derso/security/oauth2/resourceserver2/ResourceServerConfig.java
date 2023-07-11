package com.derso.security.oauth2.resourceserver2;

import static org.springframework.security.web.util.matcher.AntPathRequestMatcher.antMatcher;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.jwt.JwtDecoders;
import org.springframework.security.web.SecurityFilterChain;

// Ref.: https://www.youtube.com/watch?v=IPHKhHItrBg

@Configuration
public class ResourceServerConfig {
	
	@Value("${spring.security.oauth2.resourceserver.jwt.issuer-uri}")
	private String issuerUri;
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		return http
			.authorizeHttpRequests(
				auth -> auth
					.requestMatchers(antMatcher("/precious/not-so-much")).permitAll()
					.anyRequest().authenticated()
			)
			.oauth2ResourceServer(
				oauth2 -> oauth2
					.jwt(
						jwt -> jwt.decoder(JwtDecoders.fromIssuerLocation(issuerUri))
					)
			)
			.build();
				
	}

}
