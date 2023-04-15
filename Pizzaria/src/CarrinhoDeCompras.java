import java.util.ArrayList;

public class CarrinhoDeCompras {
	static ArrayList<Pizza> pizzas = new ArrayList<Pizza>();

	public CarrinhoDeCompras() {
	}

	public boolean adiciona(Pizza pizza) {
		// Verifica se a pizza possui ingredientes
		// Se for igual a 0 não adiciona a pizza ao ArrayList e retorna false

		if (pizza.getQtdIngrediente() == 0)
			return false;

		// Adiciona ao ArrayList
		pizzas.add(pizza);
		return true;
	}

	public int getTotalPizzas() {
		return pizzas.size();
	}

	public int getTotalValorPizzas() {
		// Cria uma variavel para o total

		int valorTotalPizzas = 0;
		// Percorre a lista e incrementa a variavel
		for (Pizza pizza : pizzas) {
			valorTotalPizzas += pizza.getPreco(pizza.getQtdIngrediente());
		}

		return valorTotalPizzas;
	}

	public static void zera() {
		CarrinhoDeCompras.pizzas.clear();

	}
}
