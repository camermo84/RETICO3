package CICLO3.RETO3.repository;

import CICLO3.RETO3.model.CLIENT;
import CICLO3.RETO3.repository.crud.ClientCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Repository
public class ClientRepository {


    @Autowired
    private ClientCrudRepository ccr;

    public List<CLIENT> getAll() {
        return (List<CLIENT>) ccr.findAll();
    }

    public Optional<CLIENT> getCLIENT(Integer id) {
        return ccr.findById(id);
    }

    public CLIENT save(CLIENT p){
        return ccr.save(p);
    }

}