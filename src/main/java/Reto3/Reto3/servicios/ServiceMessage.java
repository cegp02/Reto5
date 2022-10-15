package Reto3.Reto3.servicios;

import Reto3.Reto3.entidades.Message;
import Reto3.Reto3.repositorios.RepositoryMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceMessage {
    @Autowired
    private RepositoryMessage rm;

    public List<Message> allMessage(){
        return  rm.findAll();
    }

    public Message saveMessage(Message msg){
        return rm.save(msg);
    }

    public Message updateMessage(Message msg){
        return  rm.save(msg);
    }

    public void deleteMessage(Message msg){
        rm.delete(msg);
    }

    public Message findMessageById(Integer doc){
        return  rm.findById(doc).get();
    }

    public void deleteMessageById(Integer doc){
        rm.deleteById(doc);
    }
}
