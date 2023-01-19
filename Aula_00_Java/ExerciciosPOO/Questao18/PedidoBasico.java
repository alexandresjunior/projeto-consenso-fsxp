package ExerciciosPOO.Questao18;

import java.util.Date;
import java.math.BigDecimal;
import java.util.ArrayList;

public class PedidoBasico extends Pedido{
    
    public PedidoBasico(Date dataPedido, boolean status,
     ArrayList<ItemPedido> itemPedido,
     BigDecimal valorTotal) {
        super(dataPedido, status, itemPedido, valorTotal);
    }
    private String nome;
    private ArrayList<Gerente> gerentes;
    public void PedidoBasico(Gerente gerente){
        gerentes = new ArrayList<Gerente>();
        gerentes.add(gerente);
    }
}
