
public class CarroSoma extends CarroDeCorrida {
	private int potencia;
	
	public CarroSoma(String nome,int potencia, int velocidadeMaxima) {
		super(nome, velocidadeMaxima);
		this.potencia = potencia;
		
	}
	@Override
	public void acelera() {
		velocidade += potencia;
		if (velocidade > velocidadeMaxima)
			velocidade = velocidadeMaxima;
	}
}
