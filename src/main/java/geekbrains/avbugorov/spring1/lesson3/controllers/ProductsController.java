package geekbrains.avbugorov.spring1.lesson3.controllers;

import geekbrains.avbugorov.spring1.lesson3.model.Product;
import geekbrains.avbugorov.spring1.lesson3.srvices.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller

public class ProductsController {

    private ProductService productService;

    @Autowired
    public ProductsController(ProductService productService) {
        this.productService = productService;
    }

    //  http://localhost:8189/app/product/1
    @GetMapping("/product/{id}")
    public String returnProductById(Model model, @PathVariable long id) {
        model.addAttribute("product", productService.returnProductById(id));
        return "product_info";
    }

    //  http://localhost:8189/app/all_products/
    @GetMapping("/all_products")
    public String returnAllProducts(Model model) {
        model.addAttribute("products", productService.getAll());
        return "products";
    }

    //  http://localhost:8189/app/edit_price/
    @GetMapping("/edit_price")
    public String returnAllProductsAndEditPrice(Model model, @RequestParam(required = false) Long id,
                                                @RequestParam(required = false) Integer increment) {
        if (id != null) {
            productService.incrementPrise(id, increment);
        }
        model.addAttribute("products", productService.getAll());
        return "edit_products";
    }

    //  http://localhost:8189/app/create_product
    @GetMapping("/create")
    public String showFormAddProduct() {
        return "create_product";
    }

    @PostMapping("/create")
    public String saveProduct(@RequestParam String title, @RequestParam Integer price) {
        Product product = new Product(title, price);
        productService.save(product);
        return "redirect:/all_products";
    }
}
