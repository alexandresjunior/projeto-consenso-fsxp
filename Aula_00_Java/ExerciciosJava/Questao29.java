public class Questao29 {
    
    public static void main(String[] args) {
        int j = 7,i = 1,contador = 1;

        while(true){
            System.out.printf("I=%d J=%d\n",i,j);
            j--;
            if(contador == 3){
                j = 7;
                i += 2;
            }else if(contador == 6){
                j =7;
                i+=6;
            }
            contador++;
            
            if(contador > 9){
                break;
            }

        }
        

    }

}
