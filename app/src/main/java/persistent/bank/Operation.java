package persistent.bank;

public class Operation {

   private double type;
   private double date;
   private User user;

   public Operation(double type, double date){
       this.type = type;
       this.date = date;
   }

   public boolean equals(Object object) {
       if(object == this) {
        return true;
        }
        if (!(object instanceof Operation)) {
            return false;
        }
        
        Operation subscript = (Operation) object;

         return Double.compare(type, subscript.type) == 0 && Double.compare(date, subscript.date) == 0;
    }
   
    
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
