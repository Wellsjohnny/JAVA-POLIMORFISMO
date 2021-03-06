package model;

public abstract class Pessoa {
	private String Enderešo;
	private String bairro;
	private long cep;
	private String Estado;
	private String Cidade;
	private String Email;
	private long Telefone;
	
	
	public String getEstado() {
		return Estado;
	}
	public void setEstado(String estado) {
		Estado = estado;
	}
	public String getCidade() {
		return Cidade;
	}
	public void setCidade(String cidade) {
		Cidade = cidade;
	}
	public String getEnderešo() {
		return Enderešo;
	}
	public void setEnderešo(String enderešo) {
		Enderešo = enderešo;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public long getCep() {
		return cep;
	}
	public void setCep(long cep) {
		this.cep = cep;
	}
	
	public abstract void falar();
}
