package br.com.empresa.modelos;

public class PessoaJuridica extends Pesssoa{
	private long idPessoaJuridica;
	private String cnpjPessoaJuridica;

	public String getCnpjPessoaJuridica() {
		return cnpjPessoaJuridica;
	}

	public void setCnpjPessoaJuridica(String cnpjPessoaJuridica) {
		this.cnpjPessoaJuridica = cnpjPessoaJuridica;
	}

	public long getIdPessoaJuridica() {
		return idPessoaJuridica;
	}

	public void setIdPessoaJuridica(long idPessoaJuridica) {
		this.idPessoaJuridica = idPessoaJuridica;
	}
	

}
