package app18b.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import app18b.domain.Product;
/**
 * @author gyao
 * @create date 2019-05-07 3:56 PM
 **/
@Service
public class ProductServiceImpl implements ProductService {
    private Map<Long, Product> products = new HashMap<Long, Product>();
    private AtomicLong generator = new AtomicLong();

    public ProductServiceImpl() {
        Product product = new Product();
        product.setName("JX1 Power Drill");
        product.setDescription("Powerful hand drill, made to perfection");
        product.setPrice(129.99F);
        add(product);
    }

    @Override
    public Product add(Product product) {
        long newId = generator.incrementAndGet();
        product.setId(newId);
        products.put(newId, product);
        return product;
    }

    @Override
    public Product get(long id) {
        return products.get(id);
    }
}
