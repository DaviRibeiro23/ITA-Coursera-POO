//Adicionar interface = add(em criar Classe) e depois digitar nome da interface

public class Candidato implements Comparable<Candidato> {
	private int nota;
	private boolean deficiente;
	private int idade;

	public Candidato(int nota, boolean deficiente, int idade) {
		super();
		this.nota = nota;
		this.deficiente = deficiente;
		this.idade = idade;
	}

	// Somente selecionei getters
	public int getNota() {
		return nota;
	}

	public boolean isDeficiente() {
		return deficiente;
	}

	public int getIdade() {
		return idade;
	}

	@Override
	public int compareTo(Candidato outro) {
		// Notas iguais
		if (this.nota == outro.getNota()) {
			// Se são deficientes
			if (this.deficiente == outro.isDeficiente()) {
				return this.idade - outro.getIdade();

			} else {
				if (this.deficiente)
					return 1;
				else
					return -1;
			}
		} else {

			return this.nota - outro.getNota();
		}
	}

	//Source --> Override/Implements Methods --> ToString
	// Irá imprimir o objeto
	@Override
	public String toString() {

		return this.nota + "; " + this.deficiente + "; " + this.idade;
	}
}
