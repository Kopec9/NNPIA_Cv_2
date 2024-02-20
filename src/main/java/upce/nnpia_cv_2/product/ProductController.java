package upce.nnpia_cv_2.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api/v2/")
@RestController
public class ProductController {
    private final ProductService productService;


    public ProductController() {
        this.productService = new ProductService();
        
    }

    // Získání všech produktů
    @GetMapping("/all")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    // Získání konkrétního produktu podle ID
    @GetMapping("/{productId}")
    public Product getProductById(@PathVariable int productId) {
        return productService.getProductById(productId);
    }
}
