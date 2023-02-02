package ExerciciosPOO.Questao18;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;

public class PedidoDelivery extends Pedido {
    
    public PedidoDelivery(Date dataPedido, boolean status, ArrayList
    <ItemPedido> itemPedido, BigDecimal valorTotal) {
        super(dataPedido, status, itemPedido, valorTotal);
    }

    private Cliente cliente;

    public void add(ArrayList<PedidoDelivery> pedidoDelivery) {
    }
    

}
