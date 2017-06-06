package Models;

import java.util.ArrayList;
import java.util.List;

public class Page {
	private Usuario admin;
	private List<Postagem> postagem;
	private List<Usuario> usuarioCurtiu;// Usuarios que curtiram a pagina
	private List<Usuario> seguidores;// Usuarios que seguem a pagina
	
	public Page(Usuario admin) {
		this.admin = admin;
		this.postagem = new ArrayList<>();
		this.usuarioCurtiu = new ArrayList<>();
		this.seguidores = new ArrayList<>();
	}
	
	public Usuario getAdmin() {return admin;}
	
	public List<Postagem> getPostagem() {return postagem;}
	
	public List<Usuario> getSeguidores() {return seguidores;}
	
	public List<Usuario> getUsuarioCurtiu() {return usuarioCurtiu;}
	
	public void setAdmin(Usuario admin) {this.admin = admin;}

}
