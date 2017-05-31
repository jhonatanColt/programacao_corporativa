package Models;

public class Curtida {
	private String[] tipos = {"like", "Haha", "Love", "Wow", "Sad", "Angry"};
	private String tipo;
	
	public Curtida() { tipo = tipos[0]; }
	
	public Curtida(int index) {
		this.tipo = tipos[index];
	}
	
	public String getTipo() { return tipo; }
}
