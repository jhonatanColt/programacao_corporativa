package Q3;

import java.util.ArrayList;
import java.util.List;

public class Escala {
	private List<String> horario;
	private List<Funcionario> funcionario;
	
	public Escala(){this.horario = new ArrayList<>(); this.funcionario = new ArrayList<>();}

	public List<Funcionario> getFuncionario() {
		return funcionario;
	}
	
	public List<String> getHorario() {
		return horario;
	}
	
	public void setFuncionario(List<Funcionario> funcionario) {
		this.funcionario = funcionario;
	}
	
	public void setHorario(List<String> horario) {
		this.horario = horario;
	}
}
