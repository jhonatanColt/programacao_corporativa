package Models;

import java.util.ArrayList;
import java.util.List;

public class Grupo {
	private Usuario admin;
	private List<Usuario> listaUsuario;
	private List<Postagem> listaPostagem;
	
	public Grupo(Usuario admin){
		this.admin = admin;
		this.listaPostagem = new ArrayList<>();
		this.listaUsuario = new ArrayList<>();
	}
	
	public Usuario getAdmin() {return admin;}
	
	public void setAdmin(Usuario admin) {this.admin = admin;}
	
	public List<Usuario> getListaUsuario() {return listaUsuario;}
	
	public List<Postagem> getListaPostagem() {return listaPostagem;}
	
}
