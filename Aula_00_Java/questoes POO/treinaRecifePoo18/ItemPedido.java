package treinaRecifePoo18;

import java.util.ArrayList;

public class ItemPedido {
 
    private int quantidade;
    private Produto produtos;
    private ItemPedido itemPedido;
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public Produto getProduto() {
        return produtos;
    }
    public void setProduto(Produto produtos) {
        this.produtos = produtos;
    }
    public ItemPedido(int quantidade, Produto produto, ItemPedido itemPedido) {
        this.quantidade = quantidade;
        this.produtos = produto;
        
    }
    public void addAll(ArrayList<ItemPedido> itemPedido2) {
    }
    
}
    


