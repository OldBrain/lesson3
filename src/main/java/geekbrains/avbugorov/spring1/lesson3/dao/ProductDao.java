package geekbrains.avbugorov.spring1.lesson3.dao;

import geekbrains.avbugorov.spring1.lesson3.model.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class ProductDao {
    SessionFactory sessionFactory;

    public ProductDao() {

    }

    public ProductDao(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void initProductEntityAndSave(List<Product> productList) {
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        for (Product item : productList) {
            session.save(item);
        }
        session.getTransaction().commit();
    }

    public List<Product> getAll() {
        List<Product> tempList;
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        tempList = session.createQuery("from Product").list();
        session.getTransaction().commit();
        return tempList;
    }


    public void save(Product product) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(product);
        session.getTransaction().commit();
    }
    public void update(Product product) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.saveOrUpdate(product);
        session.getTransaction().commit();
    }

    public Product returnProductById(long id) {
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        Product product = session.get(Product.class, id);
        session.getTransaction().commit();
        return product;
    }

    public void deleteById(Long id) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Product product = session.get(Product.class, id);
        session.delete(product);
        session.getTransaction().commit();
    }

}
