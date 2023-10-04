package iphone;

import navegador.Navegador;

public class Telefone {
	private String telefone;
	Navegador navegador;
	public Telefone(String telefone) {
		super();
		this.telefone = telefone;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String ligar(String telefone) {
		return telefone;
	}
	
	public String atender() {
		String receber;
		receber = "atendendo chamada...";
		return receber;
	}
	public String iniciarCorreioDeVoz(String telefone) {
		String tel = "chamando correio de voz";
		return tel;
	}
	public Navegador acessarNavegador(Navegador navegador) {
		Navegador navegador1 = new Navegador();
		return navegador1;
	}
	
}
