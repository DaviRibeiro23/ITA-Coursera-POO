import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {

	public static void main(String[] args) {

		// true = � deficiente
		// false = n�o � deficiente

		List<Candidato> lista = new ArrayList<>();
		lista.add(new Candidato(80, true, 30));
		lista.add(new Candidato(80, false, 25));
		lista.add(new Candidato(80, true, 28));
		lista.add(new Candidato(90, true, 20));

		// Ir� ordenar a lista
		Collections.sort(lista);

		// Ir� percorrer a lista de candidatos
		for (Candidato c : lista) {
			System.out.println(c);
		}
	}
}
