import java.util.Scanner;

public class MainContaBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Cria uma nova conta bancária com o saldo inicial
        double saldoInicial = scanner.nextDouble();
        ContaBancaria conta = new ContaBancaria(saldoInicial);

        // Lê o valor do depósito e aciona o método "depositar"
        double valorDeposito = scanner.nextDouble();
        conta.depositar(valorDeposito);

        // Lê o valor do saque e aciona o método "sacar"
        double valorSaque = scanner.nextDouble();
        conta.sacar(valorSaque);

        // Fecha o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}

class ContaBancaria {
    private double saldo;

    // Construtor para inicializar o saldo
    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    // Método para realizar depósitos
    public void depositar(double valor) {
          saldo += valor;
          System.out.println("Deposito feito.");
        
        imprimirSaldo();
    }

    // Método para realizar saques
    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente. Saque nao realizado.");
        } else {
            saldo -= valor;
            System.out.println("Saque feito.");
        }
        imprimirSaldo();
    }

    // Método para imprimir o saldo atual
    private void imprimirSaldo() {
        System.out.printf("Saldo atual: %.1f\n", this.saldo);
    }
}