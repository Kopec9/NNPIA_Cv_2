package upce.nnpia_cv_2.product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductService implements IProductService {
    private Map<Integer, Product> productMap = new HashMap<>();

    public ProductService() {
        // Inicializace HashMap s několika produkty
        productMap.put(1, new Product(1, "Product1", 100.0));
        productMap.put(2, new Product(2, "Product2", 150.0));
        productMap.put(3, new Product(3, "Product3", 200.0));
    }

    @Override
    public List<Product> getAllProducts() {
        return new ArrayList<>(productMap.values());
    }

    @Override
    public Product getProductById(int productId) {
        return productMap.get(productId);
    }
}
