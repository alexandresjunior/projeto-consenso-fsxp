package poo.questao4;

public class Alimento extends ItemDeLoja{
    private Integer selo;

    public Integer getSelo() {
        return selo;
    }

    public void setSelo(Integer selo) {
        this.selo = selo;
    }

    @Override
    public int getIdentificador(){
        return this.selo;
    }
    
}
