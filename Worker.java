package exercicioEnumeracao;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

//TRABALHADOR
public class Worker {
	//ATRIBUTOS
	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	//ASSOCIACAO DE CLASSES (COMPOSIÇÃO DE OBJETO)
	//CLASSE WORK TEM 1 DEPARTMENT
	private Department department;
	//CLASSE WORK TEM VARIOS CONTRATOS
	private List<HourContract> contracts = new ArrayList<>();
	//CONSTRUTOR VAZIO
	public Worker() {
		
	}
	//CONSTRUTOR COM PARAMETROS. NÃO PODE TER ATRIBUTOS DO TIPO LISTA.
	public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {		
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}
	//GETERS E SETERS
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public WorkerLevel getLevel() {
		return level;
	}
	public void setLevel(WorkerLevel level) {
		this.level = level;
	}
	public Double getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public List<HourContract> getContracts() {
		return contracts;
	}
	//METODO ADICIONAR A LISTA DE CONTRATOS(contracts) NO contract DO PARAMETRO
	public void addContract(HourContract contract) {
		//contracts da lista acima adiciona contratos do parametros do metodo
		contracts.add(contract);
	}
	public void removeContract(HourContract contract) {
		//contracts da lista acima remove contratos do parametros do metodo
		contracts.remove(contract);
	}
	//METODO QUANTO O FUNCIONARIO GANHOU EM ANO E MÊS
	public double income(int year, int month) {
		//VARIAVEL SOMA
		double sum = baseSalary;
		Calendar cal = Calendar.getInstance();
		//PERCORRER OS CONTRATOS DO FUNCIONARIO, TESTANDO QUAIS SÃO DO MES E ANO ESPECIFICADO.
		//AI, VAI ENTRAR NA VARIAVEL SOMA
		//PARA CADA CONTRATO "c" NA LISTA contracts
		for(HourContract c : contracts) {
			cal.setTime(c.getDate());
			int c_year = cal.get(Calendar.YEAR);
			int c_month = 1 + cal.get(Calendar.MONTH);
			if(year == c_year && month == c_month) {
			sum += c.totalValue();
			}
		}
		return sum;
	}
	
	
	

}
