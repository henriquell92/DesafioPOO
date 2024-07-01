package Iphone;



public class Iphone {
	
	public static void main(String[] args) {
		
		AparelhoIphone iphone = new AparelhoIphone();
		
		System.out.println("Play: ");
		iphone.selecionarMusica("Rock");
		iphone.tocar();
		iphone.pausar();
		
		System.out.println("Ligando ");
		iphone.atender();
		iphone.iniciarCorreioVoz();
		iphone.ligar(33445599);
		
	    System.out.println("------------->");
	    iphone.exibirPagina();
	    iphone.atualizarPagina();
	    iphone.adicionarNovaAba();
		

		
	}

}
