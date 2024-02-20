package upce.nnpia_cv_2.product;

import java.util.List;

public interface IProductService {
    List<Product> getAllProducts();
    Product getProductById(int productId);
}
