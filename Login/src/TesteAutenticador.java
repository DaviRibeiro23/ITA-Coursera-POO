import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class TesteAutenticador {
	Usuario u;

	@Test
	public void loginComSucesso() throws LoginException {
		Autenticador a = new Autenticador();
		u = a.logar("guerra", "senhadoguerra");
		assertEquals("guerra", u.getLogin());

	}

	@Test(expected = LoginException.class)
	public void loginFalho() throws LoginException {
		Autenticador a = new Autenticador();
		u = a.logar("guerra", "senhaerradadoguerra");
	}

	@Test
	public void informacaoDoErro() {
		Autenticador a = new Autenticador();
		try {
			u = a.logar("guerra", "senhaerradadoguerra");
			fail();
		} catch (LoginException e) {
			assertEquals("guerra", e.getLogin());

		}
	}
}
