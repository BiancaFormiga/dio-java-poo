package desafioBanco;

public class ContaPoupanca extends Conta{
	
	public ContaPoupanca(Cliente cliente) {
		super(cliente);

	}

	@Override
	public void imprimirExtrato() {
		
		System.out.println("=== Extrato Conta Poupança do Banco " + nomeBanco + "===");
		super.imprimirInforComum();

	}


}
