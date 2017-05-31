package Models;

import java.util.ArrayList;
import java.util.List;

public class Postagem extends Post{
	private List<Comentario> comentarios;
	
	public Postagem(String msg) {
		super(msg);
		comentarios = new ArrayList<>();
	}
	
	public void comentar(Comentario coment){ this.comentarios.add(coment); }
	
}
