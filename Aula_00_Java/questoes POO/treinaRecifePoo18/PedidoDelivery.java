package treinaRecifePoo18;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.ArrayList;

public class PedidoDelivery extends Pedido{
    public PedidoDelivery(Date dataPedido, boolean status, ArrayList<ItemPedido> itemPedido, BigDecimal valorTotal) {
        super(dataPedido, status, itemPedido, valorTotal);
    }

    private Cliente cliente;

    public void add(ArrayList<PedidoDelivery> pedidoDelivery) {
    }
}
