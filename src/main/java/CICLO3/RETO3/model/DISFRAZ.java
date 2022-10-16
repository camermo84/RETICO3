package CICLO3.RETO3.model;
import javax.persistence.*;

@Entity
@Table(name="DISFRAZ")
public class DISFRAZ {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;
    @Column(nullable = false, length = 20)
    private String BRAND;
    @Column(nullable = false, length = 30)
    private Integer MODEL;
    @Column(nullable = false, length = 30, unique = true)
    private Integer CATEGORY_ID;
    @Column(nullable = false, length = 4000)
    private String NAME;

    public DISFRAZ() {
    }

    public DISFRAZ(int ID, String BRAND, Integer MODEL, Integer CATEGORY_ID, String NAME) {
        this.ID = ID;
        this.BRAND = BRAND;
        this.MODEL = MODEL;
        this.CATEGORY_ID = CATEGORY_ID;
        this.NAME = NAME;
    }

    public Integer getID() {
        return ID;
    }

    public String getBRAND() {
        return BRAND;
    }

    public Integer getMODEL() {
        return MODEL;
    }

    public Integer getCATEGORY_ID() {
        return CATEGORY_ID;
    }

    public String getNAME() {
        return NAME;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public void setBRAND(String BRAND) {
        this.BRAND = BRAND;
    }

    public void setMODEL(Integer MODEL) {
        this.MODEL = MODEL;
    }

    public void setCATEGORY_ID(Integer CATEGORY_ID) {
        this.CATEGORY_ID = CATEGORY_ID;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }
}
