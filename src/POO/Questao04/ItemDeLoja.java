package POO.Questao04;

public class ItemDeLoja {

    private int codigoDoItem;
    private String nomeDoItem;
    private String descricaoDoItem;
    private double valorDoitem;

    public int getIdentificador(){
        return this.codigoDoItem;
    }

    public int getCodigoDoItem() {
        return codigoDoItem;
    }

    public void setCodigoDoItem(int codigoDoItem) {
        this.codigoDoItem = codigoDoItem;
    }

    public String getNomeDoItem() {
        return nomeDoItem;
    }

    public void setNomeDoItem(String nomeDoItem) {
        this.nomeDoItem = nomeDoItem;
    }

    public String getDescricaoDoItem() {
        return descricaoDoItem;
    }

    public void setDescricaoDoItem(String descricaoDoItem) {
        this.descricaoDoItem = descricaoDoItem;
    }

    public double getValorDoitem() {
        return valorDoitem;
    }

    public void setValorDoitem(double valorDoitem) {
        this.valorDoitem = valorDoitem;
    }
    
}
