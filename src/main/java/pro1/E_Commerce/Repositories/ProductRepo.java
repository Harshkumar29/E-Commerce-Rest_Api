package pro1.E_Commerce.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import pro1.E_Commerce.Entities.Products;

public interface ProductRepo extends JpaRepository<Products,Long> {
    
}
