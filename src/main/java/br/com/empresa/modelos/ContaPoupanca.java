package br.com.empresa.modelos;

import java.util.Date;

public class ContaPoupanca extends ContaComum {
private long idContaPoupanca;
private Date dataAniversario;
public long getIdContaPoupanca() {
	return idContaPoupanca;
}
public void setIdContaPoupanca(long idContaPoupanca) {
	this.idContaPoupanca = idContaPoupanca;
}
public Date getDataAniversario() {
	return dataAniversario;
}
public void setDataAniversario(Date dataAniversario) {
	this.dataAniversario = dataAniversario;
}

}
