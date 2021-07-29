package geekbrains.avbugorov.spring1.lesson3.model.repositories;

import geekbrains.avbugorov.spring1.lesson3.model.Product;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Component
public class ProductRepositoryImpl implements ProductRepository {
  private List<Product> productList;

  @PostConstruct
  public void init() {
    productList = new ArrayList<Product>(Arrays.asList(
        new Product(1l, "Cкобы для S1216 , 12,9*10 мм , 5000 шт. Арт. 140117", 351),
        new Product(2l, "Автомат для зачистки изоляции Профи усиленный", 1521),
        new Product(3l, "Адаптер для бит с защёлкой USP-3321", 204.05f),
        new Product(4l, "Бокорезы 115 мм, мини, синие ручки", 200.11f),
        new Product(5l, "Болторез Профи USP-2608 600мм", 600),
        new Product(6l, "Вороток 1/2 (трещотка), Профи", 900),
        new Product(7l, "Гвозди для F50 , 1,05*1.25 , 40 мм , 5000шт.", 800.55f)
    ));
  }

  @Override
  public List<Product> getAll() {
    return Collections.unmodifiableList(productList);
  }

  @Override
  public void save(Product product) {
    if (product.getId() != null || product.getTitle() != null) {
      productList.add(product);
    }
  }

  @Override
  public Product returnProductById(long id) {
    return productList.stream().
        filter(p -> p.getId().equals(id)).
        findFirst().get();
  }
}

