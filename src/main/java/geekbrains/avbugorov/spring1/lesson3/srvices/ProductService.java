package geekbrains.avbugorov.spring1.lesson3.srvices;

import geekbrains.avbugorov.spring1.lesson3.model.Product;
import geekbrains.avbugorov.spring1.lesson3.repositories.ProductRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private ProductRepositoryImpl productRepository;

    @Autowired
    public ProductService(ProductRepositoryImpl productRepository) {
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

    public void update(Product product) {
        productRepository.update(product);
    }

    public long getNextId() {
        return returnAll().size() + 1;
    }

    public void incrementPrise(Long id, Integer increment) {
        Product changeableProduct = returnProductById(id);
        int price = changeableProduct.getPrice();
        changeableProduct.setPrice(price + increment);
        update(changeableProduct);
    }

}
