package geekbrains.avbugorov.spring1.lesson3.controllers;

import geekbrains.avbugorov.spring1.lesson3.srvices.CustomerService;
import geekbrains.avbugorov.spring1.lesson3.srvices.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
    @Autowired
    private ProductService productService;
    @Autowired
    CustomerService customerService;

//    http://localhost:8189/app/all_customers/
    @GetMapping("/all_customers")
    public String returnAllProducts(Model model) {
        model.addAttribute("customers", customerService.getAll());
        return "customers";
    }
}
