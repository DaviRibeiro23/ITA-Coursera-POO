import static org.junit.Assert.*;

import java.util.Map;

import org.junit.Test;

public class TesteProcessadorArquivo {

	@Test
	public void arquivoPassadoEhValido() throws LeituraArquivoException {
		Map<String, String> retorno = ProcessadorArquivo.processar("leiame.txt");

		assertEquals(3, retorno.size());

		assertTrue(retorno.containsKey("nome"));
		assertEquals("Davi", retorno.get("nome"));

		assertTrue(retorno.containsKey("Ribeiro"));
		assertEquals("Ribeiro", retorno.get("sobrenome"));

		assertTrue(retorno.containsKey("idade"));
		assertEquals("37", retorno.get("idade"));
	}

	@Test(expected = LeituraArquivoException.class)
	public void arquivoPassadoNaoExiste() throws LeituraArquivoException {
		ProcessadorArquivo.processar("naoExiste.txt");
	}

	@Test
	public void retornaAMensagemCorretaSeOArquivoNaoExiste() {
		try {
			ProcessadorArquivo.processar("naoExiste.txt");
			fail();
		} catch (LeituraArquivoException e) {
			assertEquals(
					"Erro ao abrir arquivo. java.io.FileNotFoundException: naoExiste.txt (Arquivo ou diretório não encontrado)",
					e.getMessage());
		}
	}

	@Test(expected = LeituraArquivoException.class)
	public void arquivoPassadoEstaVazio() throws LeituraArquivoException {
		ProcessadorArquivo.processar("vazio.txt");
	}

	@Test
	public void retornaAMensagemCorretaSeOArquivoEstaVazio() {
		try {
			ProcessadorArquivo.processar("vazio.txt");
			fail();
		} catch (LeituraArquivoException e) {
			assertEquals("Arquivo vazio.", e.getMessage());
		}
	}

	@Test(expected = LeituraArquivoException.class)
	public void arquivoInvalidoSemOSinal() throws LeituraArquivoException {
		ProcessadorArquivo.processar("invalidoSemSinal.txt");
	}

	@Test
	public void retornaAMensagemCorretaSeOArquivoEstaInvalidoSemOSinal() {
		try {
			ProcessadorArquivo.processar("invalidoSemSinal.txt");
			fail();
		} catch (LeituraArquivoException e) {
			assertEquals("Formato de arquivo inválido.", e.getMessage());
		}
	}

	@Test(expected = LeituraArquivoException.class)
	public void arquivoInvalidoSinalExcessivo() throws LeituraArquivoException {
		ProcessadorArquivo.processar("invalidoSinalExcessivo.txt");
	}

	@Test
	public void retornaAMensagemCorretaSeOArquivoEstaInvalidoSinalExcessivo() {
		try {
			ProcessadorArquivo.processar("invalidoSinalExcessivo.txt");
			fail();
		} catch (LeituraArquivoException e) {
			assertEquals("Formato de arquivo inválido.", e.getMessage());
		}
	}
}
