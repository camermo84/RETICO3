package CICLO3.RETO3.controllers;

import CICLO3.RETO3.entities.Message;
import CICLO3.RETO3.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/Message")
public class MessageController {
    @Autowired
    private MessageService messageService;

    @GetMapping("/all")
    public List<Message> getAll(){
        return messageService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Message> getMessage(@PathVariable("id") Integer id){
        return messageService.getMessage(id);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Message save (@RequestBody Message message){
        return messageService.save(message);
    }

    @PostMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Message update(@RequestBody Message message ){
        return messageService.update(message);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") int id){
        return messageService.deleteMessage(id);
    }
}

