package geekbrains.avbugorov.spring1.lesson3.model.srvices;

import geekbrains.avbugorov.spring1.lesson3.model.Product;
import geekbrains.avbugorov.spring1.lesson3.model.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductService {
  private ProductRepository productRepository;

  @Autowired
  public ProductService(ProductRepository productRepository) {
    this.productRepository = productRepository;
  }

  public List<Product> returnAll() {
    return productRepository.getAll();
  }

  public Product returnProductById(long id) {
    return productRepository.returnProductById(id);
  }

  public void save(Product product) {
    productRepository.save(product);
  }

  public long getNextId() {
    return returnAll().size() + 1;
  }
}
