package geekbrains.avbugorov.spring1.lesson3.model;

import javax.persistence.*;

@Entity
@Table(name = "order_list")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "order_date")
    private String order_date;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customerOrder;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product productOrder;

    @Column(name = "product_price")
    private Integer price;

    @Column(name = "product_quantity")
    private Integer quantity;

    public Order() {
    }

    public Product getProductOrder() {
        return productOrder;
    }

    public void setProductOrder(Product product) {
        this.productOrder = product;
    }

    public String getOrder_date() {
        return order_date;
    }

    public void setOrder_date(String order_date) {
        this.order_date = order_date;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public Customer getCustomerOrder() {
        return customerOrder;
    }

    public void setCustomerOrder(Customer customer) {
        this.customerOrder = customer;
    }

    @Override
    public String toString() {
        return  "Заказ №=" + id +
                ", Дата заказа ='" + order_date + '\'' +
                ", Покупатель =" + customerOrder.getName() +"\n"+
                ", Товар=" + productOrder +
                ", Цена на момент покупки=" + price +
                ", количество=" + quantity +
                ", стоимость=" + quantity*price 
                +"\n";

    }
}
