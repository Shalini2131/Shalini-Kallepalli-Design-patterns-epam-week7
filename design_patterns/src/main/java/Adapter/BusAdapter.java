package Adapter;

import Adapter.Bus;
import Adapter.Car;

public class BusAdapter implements Car {
  Bus bus;
  public BusAdapter() {
    this.bus=new Bus();
  }
  public void drive() {
    bus.run();
  }
}