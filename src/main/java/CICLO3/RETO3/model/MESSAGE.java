package CICLO3.RETO3.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="MESSAGE")
public class MESSAGE implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;
    @Column(nullable = false, length = 4000)
    private String MESSAGETEXT;


    public MESSAGE() {
    }

    public MESSAGE(Integer ID, String MESSAGETEXT) {
        this.ID = ID;
        this.MESSAGETEXT = MESSAGETEXT;
    }

    public int getID() {
        return ID;
    }

    public String getMESSAGETEXT() {
        return MESSAGETEXT;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public void setMESSAGETEXT(String MESSAGETEXT) {
        this.MESSAGETEXT = MESSAGETEXT;
    }
}
