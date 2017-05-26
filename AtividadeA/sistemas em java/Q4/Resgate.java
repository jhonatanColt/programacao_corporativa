package Q4;

public class Resgate {
	private Cliente c;
	
	public Resgate(Cliente c){ this.c = c; }
	
	public Cliente getC() {
		return c;
	}
	
	public void setC(Cliente c) {
		this.c = c;
	}
	
	public boolean ResgatarPremio(Recompensa r){
		int cp = c.getPontos();
		int rp = r.getPontos();
		if(cp < rp)
			return false;
		else
			c.setPontos(cp - rp);
			return true;
	}
	
}
