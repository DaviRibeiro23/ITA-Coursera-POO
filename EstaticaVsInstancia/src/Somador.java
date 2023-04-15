
public class Somador {
	String nome;
	int valorInstancia;
	static int valorEstatica;
	
	void somar() {
		valorInstancia++;
		valorEstatica++;
	}
	void imprimir() {
		System.out.println("O somador "+nome+": instancia = "+valorInstancia+" e estatica = "+valorEstatica);
	}
}
