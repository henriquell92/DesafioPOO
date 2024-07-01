package Iphone.Ligacao;

public class TelefoneAbst implements TelefoneIntfc{
	
	@Override
	public void ligar(int numero) {
		System.out.println("Informar o número ao qual deseja telefonar");
	}
	
	@Override
	public void atender() {
		System.out.println("Atender a ligação");
	}
	
	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciar a mensagem de voz");
	}

}

