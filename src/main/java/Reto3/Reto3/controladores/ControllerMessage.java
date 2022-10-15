package Reto3.Reto3.controladores;

import Reto3.Reto3.entidades.Message;
import Reto3.Reto3.servicios.ServiceMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Message")
public class ControllerMessage {
    @Autowired
    private ServiceMessage sm;

    @GetMapping("/all")
    public List<Message> getMessageAll(){
        return sm.allMessage();
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED) //Status Code 201.
    public Message insertMessage(@RequestBody Message msg) {
        return sm.saveMessage(msg);
    }

    @PutMapping
    public Message updateMessage(@RequestBody Message msg){
        return sm.updateMessage(msg);
    }

    @DeleteMapping
    public void deleteMessage(@RequestBody Message msg){
        sm.deleteMessage(msg);
    }

    @GetMapping("/{doc}")
    public Message findMessageById(@PathVariable("doc")int doc){
        return sm.findMessageById(doc);
    }

    @DeleteMapping("/{doc}")
    public void deleteMessageById(@PathVariable("doc") int doc){
        sm.deleteMessageById(doc);
    }
}
