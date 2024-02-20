package upce.nnpia_cv_2.product;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ProductService implements IProductService {
    private Map<Integer, Product> productMap = new HashMap<>();

    public ProductService() {
        productMap.put(1, new Product(1, "Product1", 100.0));
        productMap.put(2, new Product(2, "Product2", 150.0));
        productMap.put(3, new Product(3, "Product3", 200.0));
    }

    @Override
    public Collection<Product> getAllProducts() {
       return productMap.values();
    }

    @Override
    public Product getProductById(int productId) {
        return productMap.get(productId);
    }
}
