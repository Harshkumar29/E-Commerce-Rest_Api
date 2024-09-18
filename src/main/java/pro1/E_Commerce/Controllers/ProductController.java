package pro1.E_Commerce.Controllers;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pro1.E_Commerce.Entities.Products;
import pro1.E_Commerce.Services.ProductService;





@RestController
@RequestMapping("/api/produts")
public class ProductController{
    private ProductService productService;

    public ProductController(ProductService productService){
        this.productService=productService;
    }

    @PostMapping()
    public ResponseEntity<Products> setProducts(@RequestBody Products products) {
        return ResponseEntity.ok(productService.saveProducts(products));
    }

    @GetMapping()
    public ResponseEntity<List<Products>> getAllProducts() {
        return ResponseEntity.ok(productService.getAllProducts());
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Products> getproductById(@PathVariable Long id) {
        return ResponseEntity.ok(productService.geProductById(id));
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<Products> updateProducts(@PathVariable Long id, @RequestBody Products products) {
        return ResponseEntity.ok(productService.updateProducts(id, products));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Long id){
        productService.deleteProduct(id);
        return ResponseEntity.noContent().build();
    }
}
