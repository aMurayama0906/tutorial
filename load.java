public class Main{
  public static int add(int x, int y){
    return x + y;
  }

  public static int add(int x, int y, int z){
    return x + y + z;
  }

  public static void main(String[] args){
    System.out.println("114 + 514 =" + add(114,514));

    System.out.println("810 + 931 + 931 =" + add(810,931,931));
  }
}