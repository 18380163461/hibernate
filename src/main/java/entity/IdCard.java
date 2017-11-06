package entity;

import java.util.Date;

public class IdCard {
    private int id;
    private Date usefullLife;
    private Person person;

    public IdCard() {
    }

    public IdCard(int id, Date usefullLife, Person person) {
        this.id = id;
        this.usefullLife = usefullLife;
        this.person = person;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getUsefullLife() {
        return usefullLife;
    }

    public void setUsefullLife(Date usefullLife) {
        this.usefullLife = usefullLife;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

}
