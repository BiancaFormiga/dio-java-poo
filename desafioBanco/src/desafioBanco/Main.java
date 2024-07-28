package desafioBanco;

public class Main {

    public static void main(String[] args) {

        // Criar clientes
        Cliente bianca = new Cliente("Bianca");
        Cliente joao = new Cliente("João");

        // Criar contas
        Conta cc = new ContaCorrente(bianca);
        Conta cp = new ContaPoupanca(joao);

        // Realizar operações nas contas
        cc.depositar(1000);
        cp.depositar(500);
        cc.transferir(200, cp);

        // Imprimir extratos
        cc.imprimirExtrato();
        cp.imprimirExtrato();

        // Mostrar todos os clientes do banco
        System.out.println("\n=== Todos os Clientes ===");
        Conta.mostrarClientes();
    }
}
