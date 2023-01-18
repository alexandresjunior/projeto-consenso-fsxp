public class Exercicio35 {
    public static void main(String[] args) {
        float num;
        float den;
        float s = 0;

        for(num = 1, den = 1; num <= 39; num+=2, den*=2){
            // System.out.println(num + "/" + den);
            s += num / den;
        }
        System.out.println(s);
    
    }
}
