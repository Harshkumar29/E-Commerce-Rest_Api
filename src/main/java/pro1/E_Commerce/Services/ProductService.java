package pro1.E_Commerce.Services;

import java.util.List;

import pro1.E_Commerce.Entities.Products;
public interface ProductService {
    Products saveProducts(Products Products);
    Products updateProducts(Long id, Products products);
    List<Products> getAllProducts();
    Products geProductById(Long id);
    void deleteProduct(Long id);
}
