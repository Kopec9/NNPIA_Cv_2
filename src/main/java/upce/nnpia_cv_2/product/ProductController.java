package upce.nnpia_cv_2.product;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RequestMapping("/products")
@RestController
public class ProductController {
    private final ProductService productService;

    public ProductController() {
        this.productService = new ProductService();
    }

    @GetMapping("/all")
    public Collection<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/{productId}")
    public Product getProductById(@PathVariable int productId) {
        return productService.getProductById(productId);
    }
}
