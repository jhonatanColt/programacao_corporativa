package Q2;

import java.util.ArrayList;
import java.util.List;

public class Grupo {
	private String nome;
	private List<Usuario> usuario;
	private Permissao permissao;
	
	public Grupo(){ usuario = new ArrayList<>(); }
	
	public void addUser(Usuario u){
		u.setGroup(this);
		usuario.add(u);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Permissao getPermissao() {
		return permissao;
	}
	public void setPermissao(Permissao permissao) {
		this.permissao = permissao;
	}
	public List<Usuario> getUsuario() {
		return usuario;
	}
	public void setUsuario(List<Usuario> usuario) {
		this.usuario = usuario;
	}
	
	
}
