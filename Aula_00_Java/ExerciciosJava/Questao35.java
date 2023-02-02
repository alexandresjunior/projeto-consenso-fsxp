

public class Questao35 {
    
    public static void main(String[] args) {
        
        double b=1,c,s=0;

        for(int i = 1; i <= 39; i=+2){

            c =i/b;
            s+=c;
            b*=2;

        }
        System.out.println(s);

    }

}
