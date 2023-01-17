package ExerciciosPOO.Questao18;

import java.math.BigDecimal;
import java.util.Date;

public class Movimentos {
    
    private Date hora;
    private BigDecimal valor;
    private Caixa operacoes;

    private Caixa saque;
    private Caixa deposito;
    
    public Date getHora() {
        return hora;
    }
    public void setHora(Date hora) {
        this.hora = hora;
    }
    public BigDecimal getValor() {
        return valor;
    }
    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
    public Caixa getOperacoes() {
        return operacoes;
    }
    public void setOperacoes(Caixa operacoes) {
        this.operacoes = operacoes;
    }

    

}
