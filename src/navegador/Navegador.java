package navegador;

public class Navegador {
	Pagina pagina;
	
	public Pagina abrirPagina(Pagina pagina) {
		return pagina;
	}

	public String addNovaAba(String aba) {
		String aba1;
		aba1 = aba;
		return aba1; 
	}
	
	public Pagina atualizarPagina(Pagina pagina, String url) {
		return pagina = new Pagina(url);
	}
	
}
