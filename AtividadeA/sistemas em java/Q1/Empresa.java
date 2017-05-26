package Q1;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	private String nome;
	private List<Funcionario> funcionario;
	private List<Linha> linha;
	private List<Onibus> onibus;
	
	public Empresa(String nome){ 
		this.nome = nome; 
		this.funcionario = new ArrayList<>();
		this.linha = new ArrayList<>();
		this.onibus = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Funcionario> getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(List<Funcionario> funcionario) {
		this.funcionario = funcionario;
	}

	public List<Linha> getLinha() {
		return linha;
	}

	public void setLinha(List<Linha> linha) {
		this.linha = linha;
	}

	public List<Onibus> getOnibus() {
		return onibus;
	}

	public void setOnibus(List<Onibus> onibus) {
		this.onibus = onibus;
	}
	
}
