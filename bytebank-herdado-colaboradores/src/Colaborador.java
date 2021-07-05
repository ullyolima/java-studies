

public abstract class Colaborador {
	private String nome;
	private String cpf;
//	protected double salario;  << protected é pouco usado
	private double salario;
	
	public Colaborador(String nome, String cpf, double salario) {
		this.setNome(nome);
		this.setCpf(cpf);
		this.setSalario(salario);
	}
	
	public abstract double getBonificacao();

	// Getters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	// Setters
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
}
