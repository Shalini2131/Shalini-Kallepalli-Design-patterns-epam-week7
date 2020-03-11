package Command;

public class SellStock implements Order {
   Stock a;
   public SellStock(Stock a){
      this.a=a;
   }
   public void execute() {
      a.sell();
   }
}