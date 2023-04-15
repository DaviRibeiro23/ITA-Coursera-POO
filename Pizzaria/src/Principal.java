
public class Principal {

	public static void main(String[] args) {

		// Inicia carrinho de compras
		CarrinhoDeCompras carrinhoCompras = new CarrinhoDeCompras();

		Pizza p1 = new Pizza();

		System.out.println("Digite ingrediente: ");

		p1.adicionaIngrediente("Tomate");
		p1.adicionaIngrediente("Tomate");
		p1.adicionaIngrediente("Orégano");
		p1.adicionaIngrediente("Calabresa");

		// Adiciona pizza 01 no carrinhoCompras
		carrinhoCompras.adiciona(p1);

		Pizza p2 = new Pizza();
		p2.adicionaIngrediente("Cebola");
		p2.adicionaIngrediente("Calabresa");

		// Adiciona pizza 02 no carrinhoCompras
		carrinhoCompras.adiciona(p2);

		Pizza p3 = new Pizza();
		p3.adicionaIngrediente("Chocolate Branco");
		p3.adicionaIngrediente("Chocolate Preto");
		p3.adicionaIngrediente("Cereja");
		p3.adicionaIngrediente("Morango");
		p3.adicionaIngrediente("Chocolate Granulado");
		p3.adicionaIngrediente("Uva");

		// Adiciona pizza 03 no carrinhoCompras
		carrinhoCompras.adiciona(p3);

		System.out.println("======= Carrinho de Compras =======");
		if (carrinhoCompras.getTotalPizzas() > 0) {
			System.out.println("Total de Pizzas Adicionadas ao Carrinho: " + carrinhoCompras.getTotalPizzas());
			System.out.println("Valor Total das Pizzas: R$ " + carrinhoCompras.getTotalValorPizzas() + "\n");
			System.out.println("======= Total de Ingredientes Utilizados =======");
			Pizza.getIngredientes();
		} else {
			System.out.println("Carrinho vazio!");
		}
		System.out.println("================================================");

	}

}
