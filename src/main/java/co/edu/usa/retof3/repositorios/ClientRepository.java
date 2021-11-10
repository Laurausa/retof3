/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usa.retof3.repositorios;

import co.edu.usa.retof3.interfaces.ClientCrudRepository;
import co.edu.usa.retof3.modelo.Client;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author laura
 */
@Repository
public class ClientRepository {
    @Autowired
    private ClientCrudRepository repo1;
    

    public List<Client> getAll(){
        return (List<Client>) repo1.findAll();       
    }
    
    public Optional <Client> getClient(int id){
        return repo1.findById(id);
    }
    
    public Client save(Client client){
        return repo1.save(client);
    }
     public void delete(Client client){
        repo1.delete(client);
    } 
    
}
