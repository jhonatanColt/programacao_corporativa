package Q1;

import java.util.ArrayList;
import java.util.List;

public class Local {
	private List<String> parada;
	
	public Local(){this.parada = new ArrayList<>();}
	
	public List<String> getParada() {
		return parada;
	}
	
	public void setParada(List<String> parada) {
		this.parada = parada;
	}
}
