package iphone;

public class TelaInicial {
	
	public static void main(String[] args) {
		
		AparelhoTelefonico celular = new AparelhoTelefonico ();
		
		celular.ligar("83999912345");
		celular.atender();
		celular.iniciarCorreioVoz();
		
		NavegadorNaInternet safari = new NavegadorNaInternet ();
		
		safari.exibirPagina("www.google.com.br");
		safari.adicionarNovaAba();
		safari.atualizarPagina();
		
		ReprodutorMusical  appleMusic = new ReprodutorMusical();
		
		appleMusic.tocar();
		appleMusic.pausar();
		appleMusic.selecionarMusica("Thunder");
		
		
	}

}
