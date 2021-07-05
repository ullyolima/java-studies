public class SistemaGestao {
	private int senha = 555;
	
	public void autentica(Autenticavel ca) {
		boolean autenticou = ca.autentica(this.senha);
		if(autenticou) {
			System.out.println("Acesso autorizado!");
		} else {
			System.out.println("Acesso negado!");
		}
	}
}
