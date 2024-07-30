import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegistroTransacoesBancariasAPIStream {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê o saldo inicial da conta
        double saldo = scanner.nextDouble();
        
        // Lê a quantidade de transações
        int quantidadeTransacoes = scanner.nextInt();

        List<Transacao> transacoes = new ArrayList<>();

        for (int i = 1; i <= quantidadeTransacoes; i++) {
            // Lê o tipo de transação e o valor
            char tipoTransacao = scanner.next().toUpperCase().charAt(0); // Garanta que seja maiúsculo
            double valorTransacao = scanner.nextDouble();

            // Cria uma nova transação e adiciona à lista
            Transacao transacao = new Transacao(tipoTransacao, valorTransacao);
            transacoes.add(transacao);

            // Atualiza o saldo com base no tipo de transação
            if (transacao.getTipo() == 'D') {
                saldo += valorTransacao; // Depósito aumenta o saldo
            } else if (transacao.getTipo() == 'S') {
                saldo -= valorTransacao; // Saque diminui o saldo
            }
        }
        
        // Exibe o saldo final
        System.out.println("Saldo : " + saldo);

        // Exibe a lista de transações
        System.out.println("Transacoes:");
        transacoes.stream()
                .map(transacao -> {
                    String tipo = transacao.getTipo() == 'D' ? "d" : "s";
                    return tipo + " de " + transacao.getValor();
                })
                .forEach(System.out::println);

        // Fecha o scanner
        scanner.close();
    }
}

class Transacao {
    private char tipo;
    private double valor;

    public Transacao(char tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public char getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }
}



