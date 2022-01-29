package geekbrains.avbugorov.spring1.lesson3;

import geekbrains.avbugorov.spring1.lesson3.srvices.CustomerService;
import geekbrains.avbugorov.spring1.lesson3.srvices.ProductService;
import org.springframework.stereotype.Controller;

@Controller
public class ForHomework6{
    final
    ProductService productService;
    final
    CustomerService customerService;


    public ForHomework6(ProductService productService, CustomerService customerService) {
        this.productService = productService;
        this.customerService = customerService;
        doingНomeWork();
    }

    private void doingНomeWork() {
        System.out.println("********************* ДЗ6 ********************************");
//        System.out.println("Все покупатели> " + customerService.getAll());
//        System.out.println("Покупатель по ID=1> " + customerService.returnCustomerById(1l));
        System.out.println("список заказов покупателя Peter "+customerService.getOrderListByCustomerId(1l));
        System.out.println("_____________________________________________________________");
        System.out.println("список заказов покупателя  Bob "+customerService.getOrderListByCustomerId(2l));
        System.out.println("_____________________________________________________________");
        System.out.println("список заказов по Товару id=1 "+productService.getOrderListByProductId(1l));
        System.out.println("_____________________________________________________________");
        System.out.println("список заказов по Товару id=2 "+productService.getOrderListByProductId(2l));
        System.out.println("*****************************************************");

    }
}
