package Q3;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	private String nome;
	private List<Funcionario> funcionario;
	private List<Percurso> percurso;
	private List<Aviao> aviao;
	
	public Empresa(){this.funcionario = new ArrayList<>(); this.percurso = new ArrayList<>(); this.aviao = new ArrayList<>();}
	
	public String getNome() { return nome; }
	
	public void setNome(String nome) { this.nome = nome; }
	
	public List<Funcionario> getFuncionario() { return funcionario; }
	
	public void setFuncionario(List<Funcionario> funcionario) { this.funcionario = funcionario; }
	
	public List<Percurso> getPercurso() { return percurso; }
	
	public void setPercurso(List<Percurso> percurso) { this.percurso = percurso; }
	
	public List<Aviao> getAviao() { return aviao; }
	
	public void setAviao(List<Aviao> aviao) { this.aviao = aviao; }
	
}
