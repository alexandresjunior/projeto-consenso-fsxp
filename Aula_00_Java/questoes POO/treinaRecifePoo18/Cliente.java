package treinaRecifePoo18;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Cliente {
    private String nome, cpf, nomeUsuario, cargo, senha;
    private BigDecimal salario;
    private Boolean status;
    private Endereco endereco;
    private PedidoDelivery pedidoDeliverys;
    public Cliente(String nome, String cpf, String nomeUsuario, String cargo, String senha, BigDecimal salario, Endereco endereco, Boolean status, ArrayList<PedidoDelivery> pedidoDelivery) {
        this.nome = nome;
        this.cpf = cpf;
        this.nomeUsuario = nomeUsuario;
        this.cargo = cargo;
        this.senha = senha;
        this.salario = salario;
        this.status = status;
        pedidoDelivery = new ArrayList<PedidoDelivery>();
        pedidoDeliverys.add(pedidoDelivery);
    }
}
