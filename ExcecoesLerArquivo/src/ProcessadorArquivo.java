import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProcessadorArquivo {
	
		
		private static Map<String, String> conteudoArquivo = new HashMap<String, String>();

		public static Map<String, String> processar(String nomeArquivo) throws LeituraArquivoException{
			try{
				File file = new File(nomeArquivo);
				Scanner sc = new Scanner(file);
				
				arquivoVazio(sc);
				
				while (sc.hasNextLine()){
					String linha = sc.nextLine();
					linhaValida(linha);
					
					String[] split = linha.split("->");
					conteudoArquivo.put(split[0], split[1]);
				}
				
				return conteudoArquivo;
				
			}catch(IOException e){
				throw new LeituraArquivoException("Erro ao abrir arquivo. " + e);
			}
		}

		private static void linhaValida(String linha) throws LeituraArquivoException {
			
			if(linha.contains("->")){
				int qtdSinal = linha.length() - linha.replaceAll("->", "").length();
				
				if(qtdSinal > 2){
					throw new LeituraArquivoException(linha);
				}			
			}else{
				throw new LeituraArquivoException("Formato de arquivo inv�lido.");
			}
		}

		private static void arquivoVazio(Scanner sc) throws LeituraArquivoException{
			if(!sc.hasNextLine())
				throw new LeituraArquivoException("Arquivo vazio.");
		}
		
	}


