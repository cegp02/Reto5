package Reto3.Reto3.servicios;

import Reto3.Reto3.entidades.Reservation;
import Reto3.Reto3.repositorios.RepositoryReservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceReservation {
    @Autowired
    private RepositoryReservation rr;

    public List<Reservation> allReservation(){
        return  rr.findAll();
    }

    public Reservation saveReservation(Reservation msg){
        return rr.save(msg);
    }

    public Reservation updateReservation(Reservation msg){
        return  rr.save(msg);
    }

    public void deleteReservation(Reservation msg){
        rr.delete(msg);
    }

    public Reservation findReservationById(Integer doc){ return rr.findById(doc).get(); }

    public void deleteReservationById(Integer doc){
        rr.deleteById(doc);
    }
}
