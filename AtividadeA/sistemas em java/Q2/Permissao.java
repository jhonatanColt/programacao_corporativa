package Q2;

public class Permissao {
	private boolean read;
	private boolean write;
	
	public Permissao(boolean r, boolean w){this.write = w; this.read = r;}
	
	public boolean isRead() {
		return read;
	}
	
	public boolean isWrite() {
		return write;
	}
	
}
