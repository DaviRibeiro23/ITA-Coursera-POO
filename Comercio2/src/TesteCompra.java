
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteCompra {
	Compra com;

	@Test
	public void testParcelaUm() {

		com = new CompraParcelada(1, 2000, 0.01);
		assertEquals(2020, com.total(), 0.01);

	}

	@Test
	public void testParcelaDois() {

		com = new CompraParcelada(2, 2000, 0.01);
		assertEquals(com.total(), 2040.2, 0.01);
	}

	@Test
	public void testParcelaCinco() {

		com = new CompraParcelada(5, 2000, 0.01);
		assertEquals(com.total(), 2102.02, 0.01);
	}

	@Test
	public void testParcelaDez() {

		com = new CompraParcelada(10, 2000, 0.01);
		assertEquals(com.total(), 2209.24, 0.01);
	}
}
