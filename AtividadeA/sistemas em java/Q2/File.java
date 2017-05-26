package Q2;

public class File {
	private String nome;
	private String descr;
	
	public String getNome(Grupo g) {
		if(g.getPermissao().isRead())
			return nome;
		return null;
	}
	public void setNome(Grupo g, String nome) {
		if(g.getPermissao().isWrite())
			this.nome = nome;
	}
	public String getDescr(Grupo g) {
		if(g.getPermissao().isRead())
			return descr;
		return null;
	}
	public void setDescr(Grupo g, String descr) {
		if(g.getPermissao().isWrite())
			this.descr = descr;
	}
	
	
}
