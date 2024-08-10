package calculadoraIMC;

public class imc {

	private Double peso;
	private Double altura;
	private Double imc;
	
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	public Double getAltura() {
		return altura;
	}
	public void setAltura(Double altura) {
		this.altura = altura;
	}
	public Double getImc() {
		return imc;
	}
	public void setImc(Double imc) {
		this.imc = imc;
	}

	public Double getResultado() {
		return imc = peso / (altura * altura);
	}
	
	
	
	
	
}
