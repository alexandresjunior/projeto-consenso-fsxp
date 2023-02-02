package ExerciciosPOO.Questao18;

import java.math.BigDecimal;
import java.util.Date;

public class Caixa {
    
    private BigDecimal valorReceita;
    private Date dataAbertura;
    private Date dataDechamento;
    private Movimentos movimento;
    
    Caixa(BigDecimal valorReceita, Date dataAbertura, Date dataDechamento, Movimentos movimento) {
        this.valorReceita = valorReceita;
        this.dataAbertura = dataAbertura;
        this.dataDechamento = dataDechamento;
        this.movimento = movimento;
    }

}
