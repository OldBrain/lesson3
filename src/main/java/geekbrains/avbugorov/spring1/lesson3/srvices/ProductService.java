package geekbrains.avbugorov.spring1.lesson3.srvices;

import geekbrains.avbugorov.spring1.lesson3.StartApplication;
import geekbrains.avbugorov.spring1.lesson3.dao.ProductDao;
import geekbrains.avbugorov.spring1.lesson3.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    final ProductDao productDao;

    @Autowired
    public ProductService(ProductDao productDao) {
        this.productDao = productDao;
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

    public void incrementPrise(Long id, Integer increment) {
        Product changeableProduct = returnProductById(id);
        int price = changeableProduct.getPrice();
        changeableProduct.setPrice(price + increment);
        update(changeableProduct);
    }

}

