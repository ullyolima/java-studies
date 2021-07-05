
public class Autenticador {
	
	private int senha;
	String login;
	
	public Autenticador(int senha, String Login) {
		this.setLogin(Login);
		this.setSenha(senha);
	}
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}

	public boolean autentica(String login, int senha) {
		if(this.senha == senha && this.login == login) {
			return true;
		} else {
			return false;
		}
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
	public void setLogin(String login) {
		this.login = login;
	}
}
