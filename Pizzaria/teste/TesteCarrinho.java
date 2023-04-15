import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TesteCarrinho {
	// Cria um objeto da classe CarrinhoDeCompras
	CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
	
	@Before
	public void before() {
		// Zera o HasMap de ingredientes a cada @Test
		CarrinhoDeCompras.zera();
	}

	// Testa o valor total de pizzas adicionadas ao carrinho
	@Test
	public void testTotalValorPizzas() {
		Pizza p1 = new Pizza();
		p1.adicionaIngrediente("Orégano");
		p1.adicionaIngrediente("Calabresa");
		// Adiciona pizza 01 no carrinhoCompras
		carrinho.adiciona(p1);

		Pizza p2 = new Pizza();
		p2.adicionaIngrediente("Cebola");
		p2.adicionaIngrediente("Calabresa");
		p2.adicionaIngrediente("Calabresa");
		// Adiciona pizza 02 no carrinhoCompras
		carrinho.adiciona(p2);

		assertEquals(35, carrinho.getTotalValorPizzas(), 0);
	}
	

	// Testa o total de pizzas adicionadas ao carrinho
	@Test
	public void testTotalPizzas() {
		Pizza p1 = new Pizza();
		p1.adicionaIngrediente("Orégano");
		p1.adicionaIngrediente("Calabresa");
		// Adiciona pizza 01 no carrinhoCompras
		carrinho.adiciona(p1);

		Pizza p2 = new Pizza();
		p2.adicionaIngrediente("Cebola");
		p2.adicionaIngrediente("Calabresa");
		p2.adicionaIngrediente("Calabresa");
		// Adiciona pizza 02 no carrinhoCompras
		carrinho.adiciona(p2);

		Pizza p3 = new Pizza();
		p3.adicionaIngrediente("Calabresa");
		// Adiciona pizza 03 no carrinhoCompras
		carrinho.adiciona(p3);

		// Pizza 04 não adicionado, está sem ingredientes
		Pizza p4 = new Pizza();
		carrinho.adiciona(p4);

		assertEquals(3, carrinho.getTotalPizzas(), 0);
	}

	// Testa a adição de pizza sem ingrediente no carrinho
	@Test
	public void testeAdicionaCarrinhoPizza() {
		Pizza p3 = new Pizza();

		assertEquals(false, carrinho.adiciona(p3));
	}
}
