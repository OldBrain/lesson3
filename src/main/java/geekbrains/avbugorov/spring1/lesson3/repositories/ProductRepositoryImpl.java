package geekbrains.avbugorov.spring1.lesson3.repositories;

import geekbrains.avbugorov.spring1.lesson3.StartApplication;
import geekbrains.avbugorov.spring1.lesson3.dao.ProductDao;
import geekbrains.avbugorov.spring1.lesson3.model.Product;
import geekbrains.avbugorov.spring1.lesson3.repositories.memory.SetProductsInMemory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductRepositoryImpl {

    private ProductDao productDao = new ProductDao(StartApplication.factory);

    public ProductRepositoryImpl() {
        productDao.initProductEntityAndSave(SetProductsInMemory.getProductList());
    }

    public List<Product> getAll() {
        return productDao.getAll();
    }

    public void save(Product product) {
        productDao.save(product);
    }

    public void update(Product product) {
        productDao.update(product);
    }

    public Product returnProductById(long id) {
        return productDao.returnProductById(id);
    }
}

