package Exercicio_18;

import java.math.BigDecimal;
import java.util.Date;

public class PagamentoNFE {

	private BigDecimal valor;
	private Date dataPagamento;

	public void efetuarPagamento() {
		System.out.println("classe: PagamentoNFE, método: efetuarPagamento()");
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

}
