package servletjsp.app16b.controller;

import servletjsp.app16b.domain.Product;
import servletjsp.app16b.form.ProductForm;
import servletjsp.app16b.validator.ProductValidator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author gyao
 * @create date 2019-05-06 10:33 AM
 **/
public class SaveProductController implements Controller {
    @Override
    public String handleRequest(HttpServletRequest request,
                                HttpServletResponse response) {
        ProductForm productForm = new ProductForm();
        // populate form properties
        productForm.setName(
                request.getParameter("name"));
        productForm.setDescription(
                request.getParameter("description"));
        productForm.setPrice(request.getParameter("price"));
        // validate ProductForm
        ProductValidator productValidator=new ProductValidator();
        List<String> errors=productValidator.validate(productForm);
        if(errors.isEmpty()){
            // create model from ProductForm
            Product product = new Product();
            product.setName(productForm.getName());
            product.setDescription(productForm.getDescription());
            product.setPrice(Float.parseFloat(productForm.getPrice()));
            // no validation error, execute action method
            // insert code to save product to the database

            // store product in a scope variable for the view
            request.setAttribute("product", product);
            return "/WEB-INF/jsp/ProductDetails.jsp";
        }else {
            // store errors and form in a scope variable for the view
            request.setAttribute("errors", errors);
            request.setAttribute("form", productForm);
            return "/WEB-INF/jsp/ProductForm.jsp";
        }
    }
}
