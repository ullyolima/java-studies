public class Analista extends Colaborador {
	
	public Analista(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
	}

	@Override
	public double getBonificacao() {
		return super.getSalario() * 0.1;
	}

}
