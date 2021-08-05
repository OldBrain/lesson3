package geekbrains.avbugorov.spring1.lesson3;

import org.hibernate.SessionFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StartApplication {
    public static SessionFactory factory = new org.hibernate.cfg.Configuration()
            .configure("hibernate.cfg.xml")
            .buildSessionFactory();

    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
        System.out.println("Все запущено!");
    }

}
