public class Exercicio29 {
    public static void main(String[] args) {

        for(int i = 0; i < 10; i++){
            if(i == 1 || i == 3 || i == 9){
                for(int j = 7; j > 4; j--){
                    System.out.println("I=" + i + " J=" + j);
                }
            }      
        }
    }
}