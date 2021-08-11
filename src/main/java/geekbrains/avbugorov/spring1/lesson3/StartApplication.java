package geekbrains.avbugorov.spring1.lesson3;

import geekbrains.avbugorov.spring1.lesson3.dao.CustomerDao;
import geekbrains.avbugorov.spring1.lesson3.model.Customer;
import geekbrains.avbugorov.spring1.lesson3.srvices.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class StartApplication {
    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
        System.out.println("Все запущено!");

    }

}
