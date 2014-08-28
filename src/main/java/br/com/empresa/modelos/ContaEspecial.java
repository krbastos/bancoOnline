package br.com.empresa.modelos;

import java.math.BigDecimal;

public class ContaEspecial extends ContaComum{
private long idContaEspecial;
private BigDecimal limiteConta;
public long getIdContaEspecial() {
	return idContaEspecial;
}
public void setIdContaEspecial(long idContaEspecial) {
	this.idContaEspecial = idContaEspecial;
}
public BigDecimal getLimiteConta() {
	return limiteConta;
}
public void setLimiteConta(BigDecimal limiteConta) {
	this.limiteConta = limiteConta;
}

}
