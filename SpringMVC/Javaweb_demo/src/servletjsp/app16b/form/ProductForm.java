package servletjsp.app16b.form;

/**
 * @author gyao
 * @create date 2019-05-06 11:32 AM
 **/
public class ProductForm {
    private String name;
    private String description;
    private String price;

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
    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }
}
