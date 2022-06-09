package persistent.bank;

public class Operation {

   private double type;
   private double date;
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
}
