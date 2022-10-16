package CICLO3.RETO3.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="client")
public class CLIENT implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;
    @Column(nullable = false, length = 4000)
    private String NAME;
    @Column(nullable = false, length = 20)
    private String EMAIL;
    @Column(nullable = false, length = 30)
    private Integer AGE;


    public CLIENT() {
    }

    public CLIENT(Integer ID, String NAME, String EMAIL, Integer AGE) {
        this.ID = ID;
        this.NAME = NAME;
        this.EMAIL = EMAIL;
        this.AGE = AGE;
    }

    public Integer getID() {
        return ID;
    }

    public String getNAME() {
        return NAME;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public Integer getAGE() {
        return AGE;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public void setAGE(Integer AGE) {
        this.AGE = AGE;
    }
}
