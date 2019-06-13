package app18a.domain;

import java.io.Serializable;

/**
 * @author gyao
 * @create date 2019-05-07 2:41 PM
 **/
public class Product implements Serializable {
    private static final long serialVersionUID = 5784L;
    private long id;
    private String name;
    private String description;
    private float price;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
}
