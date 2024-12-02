package smartphone;

import internet.NavegadorInternet;
import ipod.ReprodutorMusical;
import phone.AparelhoTelefonico;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

	public Iphone() {
		
	}
	
	@Override
	public void exibirPagina(String url) {
		System.out.println("EXIBINDO PAGINA " + url);
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("ADICIONANDO NOVA ABA");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("ATUALIZANDO PAGINA");
		
	}

	@Override
	public void ligar(String numero) {
		System.out.println("LIGANDO PARA " + numero);
		
	}

	@Override
	public void atender() {
		System.out.println("ATENDENDO");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("INICIANDO CORREIO DE VOZ");
		
	}

	@Override
	public void tocar() {
		System.out.println("TOCANDO MUSICA");
		
	}

	@Override
	public void pausar() {
		System.out.println("PAUSANDO MUSICA");
		
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("SELECIONANDO MUSICA " + musica);
		
	}

	
}
