class CalculateSimple {
  public int add(int a, int b) {
        return a + b;
  }

  public int add(int a, int b, int c) {
      return a + b + c;
  }

  public double add(double a, double b) {
      return a + b;
  }
}

public class Main{
    public static void main(String[] args) {
        CalculateSimple calculateSimple = new CalculateSimple();

        System.out.println(calculateSimple.add(12,4));
        System.out.println(calculateSimple.add(4,8,3));
        System.out.println(calculateSimple.add(5.5, 7.5));
    }
}
