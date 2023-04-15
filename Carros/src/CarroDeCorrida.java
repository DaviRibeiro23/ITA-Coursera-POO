
public abstract class CarroDeCorrida {

	protected int velocidade;
	protected int velocidadeMaxima;
	protected String nome;

	public CarroDeCorrida(String nome, int velocidadeMaxima) {

		this.velocidadeMaxima = velocidadeMaxima;
		this.nome = nome;
		this.velocidade = 0;
	}

	public abstract void acelera();

	public void frear() {
		velocidade /= 2; // velocidade = velocidade/2;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public String getNome() {
		return nome;
	}
}
