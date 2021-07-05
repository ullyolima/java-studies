public class TestaHeranca {

	public static void main(String[] args) {
		Gerente colabA = new Gerente("Júlia Santos", "264.648.366-05", 5500.0, 225, "juliasantos");
		
		System.out.println("Nome: " + colabA.getNome());
		System.out.println("Salário: " + colabA.getSalario());
		System.out.println("Bonificação: " + colabA.getBonificacao());
		
		// sobrecarga de métodos
		boolean autenticacaoSemLogin = colabA.autentica(225);
		boolean autenticacaoCompleta = colabA.autentica("juliasantos", 265);
		System.out.println("Autenticação sem login: " + autenticacaoSemLogin);
		System.out.println("Autenticação com login: " + autenticacaoCompleta);
		
		//colabA.salario = 300;
		System.out.println("Salário: " + colabA.getSalario());			
	}

}
