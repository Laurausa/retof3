/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usa.retof3.repositorios;

import co.edu.usa.retof3.interfaces.CategoryCrudRepository;
import co.edu.usa.retof3.modelo.Category;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author laura
 */
@Repository
public class CategoryRepository {
     @Autowired
    private CategoryCrudRepository repo2;

    public List<Category> getAll() {
        return (List<Category>) repo2.findAll();
    } 

    public Optional<Category> getCategory(int id){
        return repo2.findById(id);
    }
    public Category save (Category category) {
        return repo2.save(category);
    }
    public void delete(Category category){
        repo2.delete(category);
    }
    
    
}
