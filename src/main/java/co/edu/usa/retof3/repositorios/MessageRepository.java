/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usa.retof3.repositorios;

import co.edu.usa.retof3.interfaces.MessageCrudRepository;
import co.edu.usa.retof3.modelo.Message;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author laura
 */
@Repository
public class MessageRepository {
    @Autowired
    private MessageCrudRepository repo3;
    public List<Message> getAll(){
        return (List<Message>) repo3.findAll();
    }
    public Optional<Message> getMessage(int id){
        return repo3.findById(id);
    }

    public Message save(Message message){
        return repo3.save(message);
    }
     public void delete(Message message){
        repo3.delete(message);
    }
    
}

