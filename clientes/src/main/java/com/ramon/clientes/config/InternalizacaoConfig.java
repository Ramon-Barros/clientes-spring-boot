package com.ramon.clientes.config;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

@Configuration
public class InternalizacaoConfig {
    
    @Bean
    public MessageSource messageSouce(){
        ReloadableResourceBundleMessageSource messageSouce = new ReloadableResourceBundleMessageSource();
        messageSouce.setBasename("classpath:messages");
        messageSouce.setDefaultEncoding("ISO-8859-1");
        messageSouce.setDefaultLocale(Locale.getDefault());
        return messageSouce;
    }

    @Bean
    public LocalValidatorFactoryBean validatorFactoryBean(){
        LocalValidatorFactoryBean bean = new LocalValidatorFactoryBean();
        bean.setValidationMessageSource(messageSouce());
        return bean;
    }
}
