package apresentacao;

import internet.NavegadorInternet;
import ipod.ReprodutorMusical;
import phone.AparelhoTelefonico;
import smartphone.Iphone;

public class Apresentacao {
	
	public static void main(String[] args) {
		Iphone iphone = new Iphone();
		
		NavegadorInternet navegador = iphone;
		ReprodutorMusical musica = iphone;
		AparelhoTelefonico telefone = iphone;
		
		navegador.exibirPagina("google.com");
		navegador.adicionarNovaAba();
		navegador.atualizarPagina();
		
		System.out.println("----------------------------------");
		
		musica.tocar();
		musica.pausar();
		musica.selecionarMusica("R U Mine - Arctic Monkeys");
		
		System.out.println("----------------------------------");
		
		telefone.ligar("(71) 9 8877-6655");
		telefone.atender();
		telefone.iniciarCorreioVoz();
	}

}
