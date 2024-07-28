package desafioBanco;

import java.util.ArrayList;
import java.util.List;

public abstract class Conta implements IConta {

    protected String nomeBanco = "Bradesco";
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    // Lista de clientes total
    protected static List<Cliente> clientesTotal = new ArrayList<>();

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;

        // Adicionar cliente à lista global
        clientesTotal.add(cliente);
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    @Override
    public void adicionarClientes(Cliente cliente) {
        clientesTotal.add(cliente);
    }

    public static void mostrarClientes() {
        if (clientesTotal.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
        } else {
            System.out.println("Clientes do banco:");
            for (Cliente c : clientesTotal) {
                System.out.println(c.getNomeCliente());
            }
        }
    }

    protected void imprimirInforComum() {
        System.out.println(String.format("Titular: %s", this.cliente.getNomeCliente()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
}
