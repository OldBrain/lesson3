package geekbrains.avbugorov.spring1.lesson3.controllers;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
  @GetMapping
  public String showHomePage() {
    return "index";
  }

}
