package Reto3.Reto3.servicios;

import Reto3.Reto3.entidades.Client;
import Reto3.Reto3.repositorios.RepositoryClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceClient {
    @Autowired
    private RepositoryClient rc;

    public List<Client> allClient(){
        return  rc.findAll();
    }

    public Client saveClient(Client cli){
        return rc.save(cli);
    }

    public Client updateClient(Client cli){
        return  rc.save(cli);
    }

    public void deleteClient(Client cli){
        rc.delete(cli);
    }

    public Client findClientById(Integer doc){
        return  rc.findById(doc).get();
    }

    public void deleteClientById(Integer doc){
        rc.deleteById(doc);
    }
}
