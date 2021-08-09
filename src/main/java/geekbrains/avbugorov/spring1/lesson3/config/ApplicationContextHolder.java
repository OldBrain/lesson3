package geekbrains.avbugorov.spring1.lesson3.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationContextHolder {
    ApplicationContext ctx;

    @Autowired
    public ApplicationContextHolder(ApplicationContext applicationContext) {
        this.ctx = applicationContext;
    }

    @Bean
    public ApplicationContext getApplicationContext() {
        return ctx;
    }
}
