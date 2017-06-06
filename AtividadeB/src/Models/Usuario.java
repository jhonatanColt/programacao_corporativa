package Models;

import java.util.List;
import java.util.Scanner;

public class Usuario {
	private String nome;
	private String dataNasc;
	private String sexo;
	private List<Amigo> amigo;
	private List<Post> posts;
	private List<Grupo> listaGrupo;
	private Scanner leia = new Scanner(System.in);
	
	public Usuario(String nome, String sexo) {
		this.nome = nome;
		this.sexo = sexo;
	}
	
	public void receberPedidoAmizade(){
		for (int i = 0; i < amigo.size(); i++) {
			if(amigo.get(i).getStatusAmizade().equals("PENDENTE"))
				System.out.println(i+"# "+amigo.get(i).getNome());
		}
		amigo.get(leia.nextInt()).setStatusAmizade("ACEITA");
	}
	
	public List<Amigo> getAmigos() {return amigo;}
	
	public String getNome() {return nome;}
	
	public String getDataNasc() {return dataNasc;}
	
	public String getSexo() {return sexo;}
	
	public List<Post> getPosts() {return posts;}
	
	public void enviarPedidoAmizade(Usuario user){
		
	}
	
	public boolean postar(String descr){
		if(descr != null){
			posts.add(new Post(descr));
			return true;
		}
		return false;
	}
}
