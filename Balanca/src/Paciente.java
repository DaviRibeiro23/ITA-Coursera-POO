public class Paciente {
	private double peso;
	private double altura;

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double calcularIMC() {
		return this.peso / (this.altura * this.altura);

	}

	public String diagnostico() {

		if (this.calcularIMC() < 16)
			return "Baixo peso muito grave";

		else if (this.calcularIMC() >= 16 && this.calcularIMC() <= 16.99)
			return "Baixo peso grave";

		else if (this.calcularIMC() >= 17 && this.calcularIMC() <= 18.49)
			return "Baixo peso";

		else if (this.calcularIMC() >= 18.50 && this.calcularIMC() <= 24.99)
			return "Peso normal";

		else if (this.calcularIMC() >= 25 && this.calcularIMC() <= 29.99)
			return "Sobrepeso";

		else if (this.calcularIMC() >= 30 && this.calcularIMC() <= 34.99)
			return "Obesidade grau I";

		else if (this.calcularIMC() >= 35 && this.calcularIMC() <= 39.99)
			return "Obesidade grau II";

		else
			return "Obesidade morbida";
	}

	public Paciente(double pesoPaciente, double alturaPaciente) {
		this.peso = pesoPaciente;
		this.altura = alturaPaciente;
	}

	public Paciente() {
		this.peso = 0;
		this.altura = 0;
	}

	public Paciente(double pesoPaciente) {
		this.peso = pesoPaciente;
		this.altura = 1.85;
	}
}
