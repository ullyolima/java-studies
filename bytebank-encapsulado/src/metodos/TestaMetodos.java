package metodos;

public class TestaMetodos {

	public static void main(String[] args) {
		Conta contaA = new Conta(1396, 2);
		contaA.titular.setCPF("Cliente ContaA - CPF: 016.555.485-06");
		contaA.titular.setEndereco("Cliente ContaA - Endereço: Rua do bolinho, 9");
		contaA.deposita(200);
		
		System.out.println(contaA.titular.getCPF());
		System.out.println(contaA.titular.getEndereco());
		
		Conta contaB = new Conta(1445, 8);
		
		System.out.println("Saldo conta A: " + contaA.getSaldo());
		System.out.println("Saldo conta B: " + contaB.getSaldo());
		
		contaA.transfere(150, contaB);
		
		System.out.println("Saldo conta A: " + contaA.getSaldo());
		System.out.println("Saldo conta B: " + contaB.getSaldo());
		
		System.out.println(contaA.saca(50));
	}

}
