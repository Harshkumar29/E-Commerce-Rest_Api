package pro1.E_Commerce.Services.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pro1.E_Commerce.Entities.Products;
import pro1.E_Commerce.Repositories.ProductRepo;
import pro1.E_Commerce.Services.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
    private ProductRepo repo;
    @Autowired
    public ProductServiceImpl(ProductRepo repo){
        this.repo=repo;
    }
    @Override
    public Products saveProducts(Products Products) {
        return repo.save(Products);
    }
    @Override
    public Products updateProducts(Long id, Products products) {
        Products products2 = repo.findById(id).orElseThrow(()->new RuntimeException("Product Not Found"));
        products2.setDescription(products.getDescription());
        products2.setName(products.getName());
        products2.setPrice(products.getPrice());
        products2.setQuantity(products.getQuantity());
        return repo.save(products2);
    }
    @Override
    public List<Products> getAllProducts() {
        return repo.findAll();
    }
    @Override
    public Products geProductById(Long id) {
        return repo.findById(id).orElseThrow(()-> new RuntimeException("Product Not Found"));
    }
    @Override
    public void deleteProduct(Long id) {
        repo.deleteById(id);
    }

}
