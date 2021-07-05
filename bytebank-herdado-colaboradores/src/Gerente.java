

public class Gerente extends Colaborador implements Autenticavel {
	
	private Autenticador autenticador;
	
	public Gerente(String nome, String cpf, double salario, int senha, String login) {
		super(nome, cpf, salario);
		this.autenticador = new Autenticador(senha, login);
	}
	
	@Override
	public double getBonificacao() {
		return super.getSalario() * 0.5;
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
