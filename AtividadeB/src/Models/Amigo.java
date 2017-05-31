package Models;

public class Amigo extends Usuario{
	private String statusAmizade;
	
	public Amigo(String nome, String sexo) {
		super(nome, sexo);
		statusAmizade = "PENDENTE";
	}
	
	public void setStatusAmizade(String statusAmizade) {this.statusAmizade = statusAmizade;}
	
	public String getStatusAmizade() { return statusAmizade; }
}
