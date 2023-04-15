
public class CompraParcelada extends Compra {
	private int parcela;
	private double jurosMes;

	public CompraParcelada(int parcela, double valor, double jurosMensal) {
		super(valor);
		this.parcela = parcela;
		this.jurosMes = jurosMensal;
	}

	public double total() {

		return this.getValor() * (Math.pow(1 + this.jurosMes, this.parcela));
	}
}
