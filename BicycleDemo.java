import Bicycle.Bicycle;
class BicycleDemo {
  public static void main(String[] args){
    //Create two defferent
    //Bicycle objects
    Bicycle bike1 = new Bicycle();
    Bicycle bike2 = new Bicycle();

    //Invoke methods on
    //thode objects
    bike1.changeCadence(50);
    bike1.speedUp(10);
    bike1.changeGear(2);
    bike1.printStates();

    bike2.changeCadence(50);
    bike2.speedUp(10);
    bike2.changeGear(2);
    bike2.printStates();
  }
}
