package Models;

import java.util.ArrayList;
import java.util.List;

public class Post {
	protected String descricao;
	protected List<Curtida> curtidas;
	
	public Post(String msg){
		this.descricao = msg;
		curtidas = new ArrayList<>();
	}
	
	public void curtir(Curtida like){ this.curtidas.add(like); }
	
}
