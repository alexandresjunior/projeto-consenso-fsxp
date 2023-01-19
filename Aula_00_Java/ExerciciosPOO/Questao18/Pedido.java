package ExerciciosPOO.Questao18;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;

import ExerciciosPOO.Questao07.Item;

public class Pedido {
    
    private Date  dataPedido;
    private boolean status;
    private ItemPedido itemPedidos;
    private BigDecimal valorTotal;


    public void statusPedido(){
        System.out.println("Classe: Pedido \nmetodo: statusPedido");
    }


    public Date getDataPedido() {
        return dataPedido;
    }


    public void setDataPedido(Date dataPedido) {
        this.dataPedido = dataPedido;
    }


    public boolean isStatus() {
        return status;
    }


    public void setStatus(boolean status) {
        this.status = status;
    }


    public ItemPedido getItemPedido() {
        return itemPedidos;
    }


    public void setItemPedido(ItemPedido itemPedido) {
        this.itemPedidos = itemPedido;
    }


    public BigDecimal getValorTotal() {
        return valorTotal;
    }


    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Pedido(Date dataPedido, boolean status, ArrayList<ItemPedido> itemPedido, BigDecimal valorTotal) {
        this.dataPedido = dataPedido;
        this.status = status;
        this.valorTotal = valorTotal;
        itemPedido = new ArrayList<ItemPedido>();
        itemPedidos.addAll(itemPedido);
    }


    public void addAll(ArrayList<ItemPedido> pedido) {
    }
    
}
