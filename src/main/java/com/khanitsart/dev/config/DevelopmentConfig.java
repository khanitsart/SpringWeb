/**
 * 
 */
package com.khanitsart.dev.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

import com.khanitsart.dev.backend.service.EmailService;
import com.khanitsart.dev.backend.service.MockEmailService;

/**
 * @author beatrixiii Khanitsart P.
 *
 */
@Configuration
@Profile("dev")
@PropertySource("file:///${user.home}/Documents/GitWorkSpace/.springwebaws/application-dev.properties")
public class DevelopmentConfig {
	
	@Bean
	public EmailService emailService(){
		return new MockEmailService();
	}
}
