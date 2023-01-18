public class Exercicio35 {
        public static void main(String[] args) {
          double S = 0;
          double x= 1;
          double y = 1;

          while (x<=39){
            S = S + (x/y);
            x = x + 2;
            y = y * 2;

          }
          System.out.println(S);
        }
    }

