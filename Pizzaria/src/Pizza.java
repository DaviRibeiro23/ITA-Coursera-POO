import java.util.HashMap;

public class Pizza {
	// String ingrediente, Integer quantidade
	static HashMap<String, Integer> ingredientes = new HashMap<>();
	int qtdIngrediente = 0;

	public void adicionaIngrediente(String ingrediente) {
		contabilizaIngrediente(ingrediente);
		qtdIngrediente++;
	}

	public static void contabilizaIngrediente(String ingrediente) {
		/*Se não houve ingredientes adicionados, será adicionado ingrediente
		somando chave 1 + 1*/
		if (ingredientes.get(ingrediente) != null)
			ingredientes.put(ingrediente, ingredientes.get(ingrediente) + 1);
		else
			//Se não for ingrediente cadastrado, será adicionado novo ingrediente
			ingredientes.put(ingrediente, 1);

	}

	public int getQtdIngrediente() {
		return qtdIngrediente;
	}

	public int getPreco(int qtdIngrediente) {
				
		int preco = 0;
		if(qtdIngrediente >0 && qtdIngrediente<=2) {
			preco = 15;
		}else if (qtdIngrediente >= 3 && qtdIngrediente<=5) {
			preco = 20;
		}else {
			preco = 23;
		}
		return preco;
	}
	// Imprime todos os ingredientes e quantidades
		public static void getIngredientes() {
			Pizza.ingredientes.forEach((k, v)->System.out.println("- " + k + ": " + v));
		}
		
	//	Zera todos os ingredientes, limpa o HashMap
		public static void zeraIngredientes() {
			Pizza.ingredientes.clear();
		}
}
		
		

		