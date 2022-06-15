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

    private String type;
    private long date;
    private String value;

    @Transient
    private User user;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public Object getId() {
        return null;
    }
}
