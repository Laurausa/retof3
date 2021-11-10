/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usa.retof3.interfaces;

import co.edu.usa.retof3.modelo.Category;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author laura
 */
public interface CategoryCrudRepository extends CrudRepository<Category, Integer>{
    
}
