
public class Autenticador  {

	public Usuario logar(String login, String senha) throws LoginException {
		if (login.equals("guerra") && senha.equals("senhadoguerra")) {
			return new Usuario(login);
		}
		throw new LoginException("O usu�rio e senha n�o batem!", login);
		
	}
}
