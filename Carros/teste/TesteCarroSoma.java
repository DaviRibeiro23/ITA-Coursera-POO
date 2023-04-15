import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TesteCarroSoma {

	CarroDeCorrida c;

	@Before
	public void inicializaCarro() {
		c = new CarroSoma("teste", 10, 100);

	}

	@Test
	public void testCarroParado() {

		assertEquals(0, c.getVelocidade());
	}

	@Test
	public void testAcelerarVelocidadeMaxima() {
		// Acelerar 14 vezes

		for (int i = 0; i < 14; i++)
			c.acelera();
		assertEquals(100, c.getVelocidade());
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
}
