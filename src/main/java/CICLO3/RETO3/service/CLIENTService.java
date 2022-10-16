package CICLO3.RETO3.service;

import CICLO3.RETO3.model.CLIENT;
import CICLO3.RETO3.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CLIENTService {
    @Autowired
    private ClientRepository cr;

    public List<CLIENT> getAll(){
        return cr.getAll();
    }

    public Optional<CLIENT> getCLIENT(Integer id){
        return cr.getCLIENT(id);
    }

    public CLIENT save(CLIENT p){
        if(p.getID()==null){
            return cr.save(p);
        }else{
            Optional<CLIENT> paux = cr.getCLIENT(p.getID());
            if(paux.isEmpty()){
                return cr.save(p);
            }else{
                return p;
            }
        }

    }
}
