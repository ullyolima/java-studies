public class TestaPolimorfismo {
	public static void main(String[] args) {
		Gerente colabA = new Gerente("Maju Lins", "264.648.366-05", 5500.0, 558, "malulins");
		Administrador colabB = new Administrador("Roberto Sato", "468.146.797-95", 4200, 555, "robertosato");
		Analista colabC = new Analista("Cíntia Amuzt", "249.463.715-64", 3800);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(colabA);
		controle.registra(colabB);
		controle.registra(colabC);
		
		double totalBonificacao = controle.getTotal();
		System.out.println(totalBonificacao);
	}
}
