/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usa.retof3.repositorios;

import co.edu.usa.retof3.interfaces.QuadbikeCrudRepository;
import co.edu.usa.retof3.modelo.Quadbike;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author laura
 */
@Repository
public class QuadbikeRepository {  
    @Autowired
    private QuadbikeCrudRepository repo;

    public List<Quadbike> getAll() {
        return (List<Quadbike>) repo.findAll();
    }
    
   public Optional<Quadbike> getQuadbike(int id) {
        return repo.findById(id);
    }
    
    public Quadbike save(Quadbike quadbike){
        return repo.save(quadbike);
    }
    
    public void delete(Quadbike quadbike){
        repo.delete(quadbike);
    }
    
}

