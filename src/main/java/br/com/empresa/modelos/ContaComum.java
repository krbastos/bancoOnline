package br.com.empresa.modelos;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class ContaComum extends Pesssoa {
	private long idContaComum;
	public long getIdContaComum() {
		return idContaComum;
	}
	public void setIdContaComum(long idContaComum) {
		this.idContaComum = idContaComum;
	}
	protected long nro_conta;
	protected Date abertura;
	protected Date[] encerramento;
	protected String senha;
	protected BigDecimal saldo;
	private List<Pesssoa> pessoas;
	public long getNro_conta() {
		return nro_conta;
	}
	public void setNro_conta(long nro_conta) {
		this.nro_conta = nro_conta;
	}
	public Date getAbertura() {
		return abertura;
	}
	public void setAbertura(Date abertura) {
		this.abertura = abertura;
	}
	public Date[] getEncerramento() {
		return encerramento;
	}
	public void setEncerramento(Date[] encerramento) {
		this.encerramento = encerramento;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public BigDecimal getSaldo() {
		return saldo;
	}
	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}
	public List<Pesssoa> getPessoas() {
		return pessoas;
	}
	public void setPessoas(List<Pesssoa> pessoas) {
		this.pessoas = pessoas;
	}
	

}
