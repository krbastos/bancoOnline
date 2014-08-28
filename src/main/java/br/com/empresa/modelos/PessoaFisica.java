package br.com.empresa.modelos;

public class PessoaFisica extends Pesssoa  {
private long idPessoaFisica;
private String cpfPessoa;
public long getIdPessoaFisica() {
	return idPessoaFisica;
}
public void setIdPessoaFisica(long idPessoaFisica) {
	this.idPessoaFisica = idPessoaFisica;
}
public String getCpfPessoa() {
	return cpfPessoa;
}
public void setCpfPessoa(String cpfPessoa) {
	this.cpfPessoa = cpfPessoa;
}
public String getRgPessoa() {
	return rgPessoa;
}
public void setRgPessoa(String rgPessoa) {
	this.rgPessoa = rgPessoa;
}
private String rgPessoa;

}
