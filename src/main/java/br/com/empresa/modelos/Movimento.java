package br.com.empresa.modelos;

import java.math.BigDecimal;
import java.sql.Time;
import java.util.Date;

public class Movimento {
	private long idMovimento;
	private  TipoMovimentacao movimentacao;
	private Date dt_mov;
	private Time hora_mov;
	public long getIdMovimento() {
		return idMovimento;
	}
	public void setIdMovimento(long idMovimento) {
		this.idMovimento = idMovimento;
	}
	public TipoMovimentacao getMovimentacao() {
		return movimentacao;
	}
	public void setMovimentacao(TipoMovimentacao movimentacao) {
		this.movimentacao = movimentacao;
	}
	public Date getDt_mov() {
		return dt_mov;
	}
	public void setDt_mov(Date dt_mov) {
		this.dt_mov = dt_mov;
	}
	public Time getHora_mov() {
		return hora_mov;
	}
	public void setHora_mov(Time hora_mov) {
		this.hora_mov = hora_mov;
	}
	public BigDecimal getValor_mov() {
		return valor_mov;
	}
	public void setValor_mov(BigDecimal valor_mov) {
		this.valor_mov = valor_mov;
	}
	private BigDecimal valor_mov;
}
