

public class ControleBonificacao {
	private double totalBonificacao;

	public double getTotal() {
		return totalBonificacao;
	}
	
	public void registra(Colaborador colaborador) {
		double bonificacao = colaborador.getBonificacao();
		this.totalBonificacao += bonificacao;
	}
}
