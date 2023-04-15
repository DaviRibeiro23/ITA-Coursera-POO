import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestePizza {

	Pizza pizza = new Pizza();

	@Before
	// Zera ingredientes antes de iniciar teste
	public void testeInicializacao() {

		Pizza.zeraIngredientes();
	}

	@Test
	// Quantidade ingrediente
	public void testeAdicionaIngrediente2() {

		pizza.adicionaIngrediente("Manericão");
		pizza.adicionaIngrediente("Alho");

		assertEquals(2, pizza.getQtdIngrediente(), 0);
	}

	@Test
	// Quantidade ingrediente
	public void testeAdicionaIngrediente4() {

		pizza.adicionaIngrediente("Oregano");
		pizza.adicionaIngrediente("Tomate");
		pizza.adicionaIngrediente("Manericão");
		pizza.adicionaIngrediente("Alho");

		assertEquals(4, pizza.getQtdIngrediente(), 0);
	}

	@Test
	// Quantidade ingrediente
	public void testeAdicionaIngrediente6() {

		pizza.adicionaIngrediente("Oregano");
		pizza.adicionaIngrediente("Tomate");
		pizza.adicionaIngrediente("Manericão");
		pizza.adicionaIngrediente("Alho");
		pizza.adicionaIngrediente("Manericão");
		pizza.adicionaIngrediente("Alho");

		assertEquals(6, pizza.getQtdIngrediente(), 0);
	}

	@Test
	// Teste valor pizza
	public void testePreco15() {
		pizza.adicionaIngrediente("Oregano");
		pizza.adicionaIngrediente("Tomate");
		assertEquals(15, pizza.getPreco(pizza.getQtdIngrediente()), 0);
	}

	@Test
	// Teste valor pizza
	public void testePreco20() {
		pizza.adicionaIngrediente("Oregano");
		pizza.adicionaIngrediente("Tomate");
		pizza.adicionaIngrediente("Manericão");
		pizza.adicionaIngrediente("Alho");
		assertEquals(20, pizza.getPreco(pizza.getQtdIngrediente()), 0);
	}

	@Test
	// Teste valor pizza
	public void testePreco23() {
		pizza.adicionaIngrediente("Oregano");
		pizza.adicionaIngrediente("Tomate");
		pizza.adicionaIngrediente("Manericão");
		pizza.adicionaIngrediente("Alho");
		pizza.adicionaIngrediente("Frango");
		pizza.adicionaIngrediente("Alho");

		assertEquals(23, pizza.getPreco(pizza.getQtdIngrediente()), 0);
	}
}
