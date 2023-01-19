package ExerciciosPOO.Questao04;

public class Alimento extends ItemDeLoja {

    private Integer selo;

    public Alimento(){
        super();
    }

    @Override
    public int getIdentificador(){
        return this.selo;
    }
    
    
}
