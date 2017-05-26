package Q1;

import java.util.ArrayList;
import java.util.List;

public class Linha {
	private List<Local> local;
	private List<Escala> escala;
	
	public Linha(){this.local = new ArrayList<>(); this.escala = new ArrayList<>();}
	
	public List<Local> getLocal() {
		return local;
	}
	public void setLocal(List<Local> local) {
		this.local = local;
	}
	public List<Escala> getEscala() {
		return escala;
	}
	public void setEscala(List<Escala> escala) {
		this.escala = escala;
	}
	
	
}
