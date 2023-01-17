package treinaRecifePoo18;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class PedidoBasico extends Pedido{
    public PedidoBasico(Date dataPedido, boolean status, ArrayList<ItemPedido> itemPedido, BigDecimal valorTotal) {
        super(dataPedido, status, itemPedido, valorTotal);
    }
    private String nome;
    private ArrayList<Gerente> gerentes;
    public void PedidoBasico(Gerente gerente){
        gerentes = new ArrayList<Gerente>();
        gerentes.add(gerente);
    }
}
