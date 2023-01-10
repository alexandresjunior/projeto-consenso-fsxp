public class Exer35 {
    public static void main(String[] args) {
      double s = 0;
      double d = 1;
      for (int i = 1; i <= 39; i += 2) {
        s += i / d;
        d *= 2;
      }
      System.out.println(s);
    }
  }
  