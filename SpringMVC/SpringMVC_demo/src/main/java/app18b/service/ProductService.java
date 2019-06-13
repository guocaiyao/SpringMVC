package app18b.service;

import app18b.domain.Product;

/**
 * @author gyao
 * @create date 2019-05-07 3:57 PM
 **/
public interface ProductService {
    Product add(Product product);
    Product get(long id);
}
