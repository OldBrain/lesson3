package geekbrains.avbugorov.spring1.lesson3.model.repositories;

import geekbrains.avbugorov.spring1.lesson3.model.Product;

import java.util.List;

public interface ProductRepository {
  public List<Product> getAll();

  public void save(Product product);

  public Product returnProductById(long id);
}
