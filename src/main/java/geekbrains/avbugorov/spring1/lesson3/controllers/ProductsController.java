package geekbrains.avbugorov.spring1.lesson3.controllers;

import geekbrains.avbugorov.spring1.lesson3.model.Product;
import geekbrains.avbugorov.spring1.lesson3.model.srvices.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    model.addAttribute("products", productService.returnAll());
    return "products";
  }

  //  http://localhost:8189/app/create_product
  @GetMapping("/create")
  public String showFormAddProduct() {
    return "create_product";
  }

  @PostMapping("/create")
  public String saveProduct(@RequestParam String title, @RequestParam float price) {
    Product product = new Product(productService.getNextId(), title, price);
    productService.save(product);
    return "redirect:/all_products";
  }
}