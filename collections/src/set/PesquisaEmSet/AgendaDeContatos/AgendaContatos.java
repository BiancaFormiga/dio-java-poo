package set.PesquisaEmSet.AgendaDeContatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
	
	private Set<Contato> contatoSet;

	public AgendaContatos() {

		this.contatoSet = new HashSet<>() ;
	}
	
	public void adicionarContato(String nome, int numero) {
		
		contatoSet.add(new Contato(nome, numero));
	}
	
	public void exibirContatos() {
		System.out.println(contatoSet);
	}
	
	public Set<Contato> pesquisarPorNome(String nome) {
		
		Set<Contato> contatosPorNome = new HashSet<>();
		
		for(Contato c : contatoSet) {
			if(c.getNome().startsWith(nome)) {
				contatosPorNome.add(c);
				
			}
		}
		
		return contatosPorNome;
		
	}
	
	public Contato atualizarNumeroContato(String nome, int novoNumero) {
		
		Contato contatoAtualizado = null;
		
		for(Contato c : contatoSet) {
			
			if(c.getNome().equalsIgnoreCase(nome)){
				c.setNumero(novoNumero);
				contatoAtualizado = c;
				break;
			}
		}
		
		return contatoAtualizado;
	}
	
	public static void main(String[] args) {
		

	    AgendaContatos agendaContatos = new AgendaContatos();


	    agendaContatos.exibirContatos();


	    agendaContatos.adicionarContato("Camila", 123456789);
	    agendaContatos.adicionarContato("Camila", 987654321);
	    agendaContatos.adicionarContato("Camila Cavalcante", 55555555);
	    agendaContatos.adicionarContato("Camila Dio", 88889999);
	    agendaContatos.adicionarContato("Fernando", 77778888);
	    agendaContatos.adicionarContato("Maria Silva", 55555555);

	    agendaContatos.exibirContatos();

	    System.out.println(agendaContatos.pesquisarPorNome("Maria"));

	    Contato contatoAtualizado = agendaContatos.atualizarNumeroContato("Maria Silva", 44443333);
	    System.out.println("Contato atualizado: " + contatoAtualizado);

	    System.out.println("Contatos na agenda após atualização:");
	    agendaContatos.exibirContatos();
		
	}

}