package pro1.E_Commerce.Repositories;



import org.springframework.data.jpa.repository.JpaRepository;

import pro1.E_Commerce.Entities.Category;
public interface CategoryRepo extends JpaRepository<Category,Long> {

} 
