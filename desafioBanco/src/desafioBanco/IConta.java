package desafioBanco;

public interface IConta {
	
	void adicionarClientes(Cliente cliente);
		
	void sacar(double valor);
	
	void depositar(double valor);
	
	void transferir(double valor, Conta contaDestino);
	
	void imprimirExtrato();

}
