import java.util.Scanner;

abstract class Cofre {
  protected String tipo;
  protected String metodoAbertura;

  public Cofre(String tipo, String metodoAbertura) {
    this.tipo = tipo;
    this.metodoAbertura = metodoAbertura;
  }

  public void imprimirInformacoes() {
    System.out.println("Tipo: " + this.tipo);
    System.out.println("Metodo de abertura: " + this.metodoAbertura);
  }
}

class CofreDigital extends Cofre {

  private int senha;

  public CofreDigital(int senha) {
    super("Cofre Digital", "Senha");
    this.senha = senha;
  }

  public boolean validarSenha(int confirmacaoSenha) {
    return confirmacaoSenha == this.senha;
  }
}

class CofreFisico extends Cofre {

  public CofreFisico() {
    super("Cofre Fisico", "Chave");
  }

}

public class Desafio {
  public static void main(String[] args) {
    // Lê o tipo de cofre (primeira linha da entrada)
    Scanner scanner = new Scanner(System.in);
    String tipoCofre = scanner.nextLine();
    
        Cofre cofre = null;

        if (tipoCofre.equals("digital")) {
            // Solicita senha e confirmação de senha para o cofre digital
            int senha = scanner.nextInt();
            int confirmacaoSenha = scanner.nextInt();

            // Cria o cofre digital se as senhas coincidirem
            if (senha == confirmacaoSenha) {
                cofre = new CofreDigital(senha);
                System.out.println("Tipo: Cofre Digital");
                System.out.println("Metodo de abertura: Senha");
                System.out.println("Cofre aberto!");
            } else {
                System.out.println("Tipo: Cofre Digital");
                System.out.println("Metodo de abertura: Senha");
                System.out.println("Senha incorreta!");
            }
        } else if (tipoCofre.equals("fisico")) {
            // Cria o cofre físico
            cofre = new CofreFisico();
            System.out.println("Tipo: Cofre Fisico");
            System.out.println("Metodo de abertura: Chave");
        } else {
            System.out.println("Tipo de cofre inválido.");
        }

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}