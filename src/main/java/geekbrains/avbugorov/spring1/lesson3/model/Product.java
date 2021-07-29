package geekbrains.avbugorov.spring1.lesson3.model;

public class Product {
  private Long id;
  private String title;
  private float price;

  public Product(Long id) {
    this.id = id;
  }

  public Product(Long id, String title, float price) {
    this.id = id;
    this.title = title;
    this.price = price;
  }

  public Long getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public float getPrice() {
    return price;
  }

}
