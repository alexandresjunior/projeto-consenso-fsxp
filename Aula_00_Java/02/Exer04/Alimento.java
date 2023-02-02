package Exer04;

public class Alimento extends ItemDeLoja {
    private Integer selo;
    @Override
    public int getIdentificador() {
        return this.selo;
    }
}
