package list.OperacoesBasicasEmList.ListaDeTarefas;

public class Tarefa {
	
	//atributo
	
	private String descricao;

	public Tarefa(String descricao) {
		this.descricao = descricao;
	}

	public String getDescrição() {
		return descricao;
	}

	@Override
	public String toString() {
		return descricao;
	}
	
	


	
	

}
