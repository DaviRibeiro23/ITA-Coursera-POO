import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TesteCarroMult {

	CarroDeCorrida c;

	@Before
	public void inicializaCarro() {
		c = new CarroMult("teste", 1.5, 100);

	}

	@Test
	public void testCarroParado() {

		assertEquals(0, c.getVelocidade());
	}

	@Test
	public void testAcelerarUmaVez() {
		c.acelera();
		assertEquals(10, c.getVelocidade());
	}

	@Test
	public void testAcelerarDuasVezes() {
		c.acelera();
		c.acelera();
		assertEquals(15, c.getVelocidade());
	}

	@Test
	public void testFrear() {

		c.acelera();
		c.frear();
		assertEquals(5, c.getVelocidade());
	}

	@Test
	public void testFrearAteZero() {

		c.acelera();
		c.frear();
		c.frear();
		c.frear();
		c.frear();
		assertEquals(0, c.getVelocidade());
	}

	@Test
	public void testeAcelerarAteVelocidadeMaxima() {
		for (int i = 0; i < 14; i++)
			c.acelera();
		assertEquals(100, c.getVelocidade());
	}
}
