package exercicioEnumeracao;

import java.util.Date;
//HORA CONTRATO
public class HourContract {
	
	private Date date; //DATA
	private Double valeuPerHour; //VALOR POR HORA
	private Integer hours; //HORAS
	
	//CONSTRUTOR VAZIO
	public HourContract() {
		
	}
	//CONSTRUTOR COM PARAMETROS
	public HourContract(Date date, Double valeuPerHour, Integer hours) {
		
		this.date = date;
		this.valeuPerHour = valeuPerHour;
		this.hours = hours;
	}
	//GETERS E SETERS
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getValeuPerHour() {
		return valeuPerHour;
	}

	public void setValeuPerHour(Double valeuPerHour) {
		this.valeuPerHour = valeuPerHour;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}
	public Double totalValue() {
		return valeuPerHour * hours;
	}
	
	

}
