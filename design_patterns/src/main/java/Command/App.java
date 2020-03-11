package Command;

public class App {
   public static void main(String[] args) {
      Stock a=new Stock();
      BuyStock buy=new BuyStock(a);
      SellStock sell=new SellStock(a);
      Broker broker =new Broker();
      broker.takeOrder(buy);
      broker.takeOrder(sell);
      broker.placeOrders();
   }
}