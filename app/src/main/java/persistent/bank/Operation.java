package persistent.bank;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Operation {
    @Id
    @GeneratedValue
    private int id;

    private double type;
    private double date;

    @Transient
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public double getType() {
        return type;
    }

    public void setType(double type) {
        this.type = type;
    }

    public double getDate() {
        return date;
    }

    public void setDate(double date) {
        this.date = date;
    }

    public Object getId() {
        return null;
    }
}
