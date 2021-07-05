public class Auditor implements Autenticavel {
	
	private Autenticador autenticador;
	
	public Auditor(int senha, String login) {
		this.autenticador = new Autenticador(senha, login);
	}
	
	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}

	@Override
	public boolean autentica(String login, int senha) {
		return this.autenticador.autentica(login, senha);
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public void setLogin(String login) {
		this.autenticador.setLogin(login);
	}
}
