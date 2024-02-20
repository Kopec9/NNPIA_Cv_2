package upce.nnpia_cv_2.product;

import java.util.Collection;

public interface IProductService {
    Collection<Product> getAllProducts();
    Product getProductById(int productId);
}
