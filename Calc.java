package calcapp.main;
public class Calc{
  public static void main(String[] args){
    int a = 10;
    int b = 27;
    int total = calapp.logics.CalcLogic.tasu(a,b);
    int delta = calapp.logics.CalcLogic.hiku(a,b);
    System.out.println("足すと" + total + "引くと" + delta);
  }
}
