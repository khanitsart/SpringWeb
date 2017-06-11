/**
 * 
 */
package com.khanitsart.dev.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

import com.khanitsart.dev.backend.service.EmailService;
import com.khanitsart.dev.backend.service.SmtpEmailService;

/**
 * @author beatrixiii Khanitsart P.
 *
 */
@Configuration
@Profile("prod")
@PropertySource("file:///${user.home}/Documents/GitWorkSpace/.springwebaws/application-prod.properties")
public class ProductionConfig {
//	@Value("${stripe.prod.private.key}")
//    private String stripeProdKey;

    @Bean
    public EmailService emailService() {
        return new SmtpEmailService();
    }

//    @Bean
//    public String stripeKey() {
//        return stripeProdKey;
//    }
}
