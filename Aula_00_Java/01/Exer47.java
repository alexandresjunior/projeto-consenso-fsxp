public class Exer47 {
    public static void main(String[] args) {
        int a = 1;
        int r = 3;
        for (int i = 1; i <= 20; i++) {
            System.out.print((int)(a * Math.pow(r, i-1)) + " ");
        }
    }
}