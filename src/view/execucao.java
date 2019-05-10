package view;
import model.Pessoa;
import model.PessoaFisica;
import model.PessoaJuridica;
public class execucao {
	public static void main(String args[]) {
		//Pessoa pessoa = new Pessoa();
		PessoaFisica pf =new PessoaFisica();
		PessoaJuridica pj = new PessoaJuridica();
		
		pf.setNome("Wellington");
		System.out.println(pf.getNome());
		pf.falar();
		
		
		pj.setRazaoSocial("Etec Zona Leste");
		System.out.println(pj.getRazaoSocial());
		pj.falar();
		
		/*pessoa.setendereco("Rua Ipiranga");
		System.out.println(pessoa.getEndereco());*/
	}
 
}
