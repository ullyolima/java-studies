
public class TestaEnsinamentos {

	public static void main(String[] args) {
		Cliente clienteA = new Cliente("Ana Hitz", "268.448.479-85");
		ContaCorrente contaA = new ContaCorrente(2559, 2, clienteA);
		
		System.out.println(contaA.getTitular().getNome());
		System.out.println(contaA.getAgencia());

	}

}
