

public class Serie {
	
	private int temporadas =3;
	private boolean entregado= false;
	private int numerodeTemporadas=0;
	private String genero ="";
	private String creador ="";
	private String titulo= "";
	
	public Serie() {
	
	}

	public Serie(String creador, String titulo) {
		this.creador = creador;
		this.titulo = titulo;
	}

	public Serie(int temporadas, int numerodeTemporadas, String genero, String creador, String titulo) {
		this.temporadas = temporadas;
		this.numerodeTemporadas = numerodeTemporadas;
		this.genero = genero;
		this.creador = creador;
		this.titulo = titulo;
	}

	public int getTemporadas() {
		return temporadas;
	}

	public void setTemporadas(int temporadas) {
		this.temporadas = temporadas;
	}

	public int getNumerodeTemporadas() {
		return numerodeTemporadas;
	}

	public void setNumerodeTemporadas(int numerodeTemporadas) {
		this.numerodeTemporadas = numerodeTemporadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		return "Serie [getTemporadas()=" + getTemporadas() + ", getNumerodeTemporadas()=" + getNumerodeTemporadas()
				+ ", getGenero()=" + getGenero() + ", getCreador()=" + getCreador() + ", getTitulo()=" + getTitulo()
				+ "]";
	}
	
	
	
	
	}
	
	



