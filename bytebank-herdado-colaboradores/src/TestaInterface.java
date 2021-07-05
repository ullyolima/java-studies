public class TestaInterface {

	public static void main(String[] args) {
		Gerente colabA = new Gerente("Maju Lins", "264.648.366-05", 5500.0, 558, "malulins");
		Administrador colabB = new Administrador("Roberto Sato", "468.146.797-95", 4200, 555, "robertosato");
		Auditor auditor = new Auditor(555, "auditorexterno");
		
		SistemaGestao sistema = new SistemaGestao();
		sistema.autentica(colabA);
		sistema.autentica(colabB);
		sistema.autentica(auditor);
		
	}

}
