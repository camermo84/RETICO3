package CICLO3.RETO3.repository.crudRepository;

import CICLO3.RETO3.entities.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface MessageCrudRepository extends CrudRepository<Message, Integer> {

}
