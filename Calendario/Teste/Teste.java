
import java.text.ParseException;

import org.junit.Assert;
import org.junit.Test;

public class Teste {

	@Test
	public void testeMae() throws ParseException {
		Pessoa mae = new Pessoa("10/03/1950");

		Assert.assertEquals("Peixes", mae.getSigno());
		Assert.assertEquals(73, mae.getIdade());
	}

	@Test
	public void testeIrmao() throws ParseException {
		Pessoa irmao = new Pessoa("10/10/1991");

		Assert.assertEquals("Libra", irmao.getSigno());
		Assert.assertEquals(31, irmao.getIdade());
	}

	@Test
	public void testeEu() throws ParseException {
		Pessoa eu = new Pessoa("23/07/1985");

		Assert.assertEquals("Leão", eu.getSigno());
		Assert.assertEquals(37, eu.getIdade());
	}
}