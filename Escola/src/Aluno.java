
public class Aluno {

	int bim1;
	int bim2;
	int bim3;
	int bim4;

	public int media() {
		return (bim1+bim2+bim3+bim4) / 4;
	}

	public boolean passouDeAno() {

		if (media() >= 60)

			return true;
		return false;

	}
}
