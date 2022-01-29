package geekbrains.avbugorov.spring1.lesson3.srvices;

import geekbrains.avbugorov.spring1.lesson3.dao.CustomerDao;
import geekbrains.avbugorov.spring1.lesson3.model.Customer;
import geekbrains.avbugorov.spring1.lesson3.model.Order;
import geekbrains.avbugorov.spring1.lesson3.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    final
    CustomerDao customerDao;

    @Autowired
    public CustomerService(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }
    public List<Customer> getAll() {
        return customerDao.getAll();
    }

    public Customer returnCustomerById(Long customerId) {
        return customerDao.returnCustomerById(customerId);
    }

    public List<Order> getOrderListByCustomerId(Long customerId) {
        return customerDao.getOrderListByCustomerId(customerId);
    }

}
