/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usa.retof3.repositorios;

import co.edu.usa.retof3.interfaces.ReservationCrudRepository;
import co.edu.usa.retof3.modelo.Reservation;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author laura
 */
@Repository
public class ReservationRepository {
    @Autowired
    private ReservationCrudRepository repo4;
    
    public List<Reservation> getAll(){
        return (List<Reservation>) repo4.findAll();
    }
    public Optional<Reservation> getReservation(int id){
        return repo4.findById(id);
    }
    public Reservation save(Reservation reservation){
        return repo4.save(reservation);
    }
     public void delete(Reservation reservation){
        repo4.delete(reservation);
    }
}

