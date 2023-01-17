package treinaRecifePoo18;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Produto {

    private double peso;
    private int quantidade;
    private String nome;
    private BigDecimal valor;
    private String descricao;
    private ItemPedido itens;
    private Pedido pedidos;
    private List<ItemPedido> itemPedidos;

    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public BigDecimal getValor() {
        return valor;
    }
    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public ItemPedido getItens() {
        return itens;
    }
    public void setItens(ItemPedido itens) {
        this.itens = itens;
    }

    public Produto(double peso, int quantidade, String nome, BigDecimal valor, String descricao, ItemPedido itens, ArrayList<ItemPedido> pedido) {
        this.peso = peso;
        this.quantidade = quantidade;
        this.nome = nome;
        this.valor = valor;
        this.descricao = descricao;
        this.itens = itens;
        pedido = new ArrayList<ItemPedido>();
        pedidos.addAll(pedido);
    }

    
    
}
