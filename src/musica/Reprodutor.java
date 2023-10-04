package musica;

public class Reprodutor {
	String musica;

	public Reprodutor(String musica) {
		this.musica = musica;
	}

	public String getMusica() {
		return musica;
	}

	public void setMusica(String musica) {
		this.musica = musica;
	}
	
	public String tocar(String musica) {
		return musica;
	}
	
	public Object pausar(String musica) {
		return null;
	}
	
	public String selecionarMusica(String musica) {
		return musica;
	}

	@Override
	public String toString() {
		return "Reprodutor:"
				+ "está tocando a musica = " + musica + "]";
		
	}
	
	
}
