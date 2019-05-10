package model;

public class PessoaJuridica extends Pessoa {
	private String razaoSocial;
	private String Cidade;
	
	public String getCidade() {
		return Cidade;
	}

	public void setCidade(String cidade) {
		Cidade = cidade;
	}

	public String getRazaoSocial() {
		return razaoSocial;
}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	@Override
	public void falar() {
		// TODO Auto-generated method stub
		
	}

}
