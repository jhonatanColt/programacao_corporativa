package Q3;

import java.util.ArrayList;
import java.util.List;

public class Percurso {
	private String ida;
	private String volta;
	private List<Escala> escala;
	private List<Aeroporto> aeroporto;
	
	public Percurso(){this.escala = new ArrayList<>(); this.aeroporto = new ArrayList<>();}

	public String getIda() {
		return ida;
	}

	public void setIda(String ida) {
		this.ida = ida;
	}

	public String getVolta() {
		return volta;
	}

	public void setVolta(String volta) {
		this.volta = volta;
	}

	public List<Escala> getEscala() {
		return escala;
	}

	public void setEscala(List<Escala> escala) {
		this.escala = escala;
	}
	
	
}
