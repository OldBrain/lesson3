package geekbrains.avbugorov.spring1.lesson3;

import geekbrains.avbugorov.spring1.lesson3.config.ApplicationContextHolder;
import geekbrains.avbugorov.spring1.lesson3.srvices.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class ForHomework6{

    final
    ApplicationContext getApplicationContext;

    @Autowired
    public ForHomework6(ApplicationContext getApplicationContext) {
        this.getApplicationContext = getApplicationContext;
        doingНomeWork();
    }

    private void doingНomeWork() {
        CustomerService customerService = getApplicationContext.getBean(CustomerService.class);
        System.out.println("Все покупатели> " + customerService.getAll());
        System.out.println("Все покупатели> " + customerService.returnCustomerById(1l));

    }
}
