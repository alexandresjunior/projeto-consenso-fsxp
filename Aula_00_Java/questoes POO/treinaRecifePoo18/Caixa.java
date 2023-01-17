package treinaRecifePoo18;

import java.math.BigDecimal;
import java.sql.Date;

public class Caixa {
    private BigDecimal valorReceita;
    private Date dataAbertura;
    private Date dataDechamento;
    private Movimento movimento;
    Caixa(BigDecimal valorReceita, Date dataAbertura, Date dataDechamento, Movimento movimento) {
        this.valorReceita = valorReceita;
        this.dataAbertura = dataAbertura;
        this.dataDechamento = dataDechamento;
        this.movimento = movimento;
    }
}
