package com.selalerer.spring_censor;

import com.selalerer.censor.Censor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CensorConfig {

    @Bean
    public Censor censor() {
        return new Censor();
    }
}
