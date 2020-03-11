package Command;

public class BuyStock implements Order {
   private Stock a;

   public BuyStock(Stock a){
      this.a=a;
   }
   public void execute() {
      a.buy();
   }
}