
public class Main {

	public static void main(String[] args) {
		Cliente jonathan = new Cliente();
		jonathan.setNome("Jonathan");
		
		Conta cc = new ContaCorrente(jonathan);
		Conta poupanca = new ContaPoupanca(jonathan);

		cc.depositar(500);
		cc.transferir(500, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
