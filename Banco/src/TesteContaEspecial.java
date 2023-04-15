import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TesteContaEspecial {

	ContaCorrente cc;

	@Before
	public void inicializaConta() {
		cc = new ContaEspecial(100);
		cc.depositar(200);
	}

	@Test
	public void saqueMaiorQueSaldo() {

		int valorSacado = cc.sacar(350);

		assertEquals(200, cc.saldo);
		assertEquals(0, valorSacado);
	}

	@Test
	public void saqueMaiorQueSaldoDentroDoLimite() {

		int valorSacado = cc.sacar(250);

		assertEquals(-50, cc.saldo);
		assertEquals(250, valorSacado);
	}
}
