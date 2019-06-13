package servletjsp.app16b.validator;

import servletjsp.app16b.form.ProductForm;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gyao
 * @create date 2019-05-06 7:58 PM
 **/
public class ProductValidator {
    public List<String> validate(ProductForm productForm) {
        List<String> errors = new ArrayList<String>();
        String name = productForm.getName();
        if (name == null || name.trim().isEmpty()) {
            errors.add("Product must have a name");
        }
        String price = productForm.getPrice();
        if (price == null || price.trim().isEmpty()) {
            errors.add("Product must have a price");
        } else {
            try {
                Float.parseFloat(price);
            } catch (NumberFormatException e) {
                errors.add("Invalid price value");
            }
        }
        return errors;
    }
}
