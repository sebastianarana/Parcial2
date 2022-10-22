
public class VideoJuegos {

	
	private String titulo = "";
	private int horasEstimadas=10;
	private boolean entregado = false;
	private String genero = "";
	private String compañia = "";
	
	
	public VideoJuegos() {
	}


	public VideoJuegos(String titulo, int horasEstimadas) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
	}


	public VideoJuegos(String titulo, int horasEstimadas, String genero, String compañia) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.genero = genero;
		this.compañia = compañia;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public int getHorasEstimadas() {
		return horasEstimadas;
	}


	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public String getCompañia() {
		return compañia;
	}


	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}


	@Override
	public String toString() {
		return "VideoJuego [getTitulo()=" + getTitulo() + ", getHorasEstimadas()=" + getHorasEstimadas()
				+ ", getGenero()=" + getGenero() + ", getCompañia()=" + getCompañia() + "]";
	}
	
	
	

}
