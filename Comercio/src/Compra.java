
public class Compra {
	private int valorTotal;
	private int numeroParcelas;

	// a vista
	public Compra(int valor) {
		this.valorTotal = valor;
		this.numeroParcelas = 1;
	}

	// parcelado
	public Compra(int qtdParcelas, int valorParcela) {
		this.numeroParcelas = qtdParcelas;
		this.valorTotal = valorParcela * qtdParcelas;
	}

	public int getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(int valorTotal) {
		this.valorTotal = valorTotal;
	}

	public int getNumeroParcelas() {
		return numeroParcelas;
	}

	public void setNumeroParcelas(int numeroParcelas) {
		this.numeroParcelas = numeroParcelas;
	}
	public int valorParcela() {
		return valorTotal/numeroParcelas;
	}
}


