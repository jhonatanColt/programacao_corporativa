package Models;

import java.util.ArrayList;
import java.util.List;

public class Comentario extends Post{
	private List<Post> respostas;
	
	public Comentario(String msg) {
		super(msg);
		respostas = new ArrayList<>();
	}
	
	public void resposta(Post post){ respostas.add(post); }
	
}
