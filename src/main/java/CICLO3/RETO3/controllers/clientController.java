package CICLO3.RETO3.controllers;

import CICLO3.RETO3.model.CLIENT;
import CICLO3.RETO3.service.CLIENTService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping(path = "/api/Client")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class clientController {

    @Autowired  //evita que lleguen datos nulos
    private CLIENTService cs;

    @GetMapping("/all")
    public List<CLIENT> getCLIENTS(){
        return cs.getAll();
    }

    @GetMapping("/{id}")
    public Optional<CLIENT> getCLIENT(@PathVariable("id") Integer id){
        return cs.getCLIENT(id);
    }


    @PostMapping ("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public CLIENT save(@RequestBody CLIENT p){
        return cs.save(p);
    }



}
