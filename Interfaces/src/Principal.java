
public class Principal {

	public static void main(String[] args) {
		Barulhento[] barulhentos = new Barulhento[10];
		
		barulhentos[0] = new Cachorro();
		barulhentos[1] = new Carro();
		barulhentos[2] = new Bateria();
		barulhentos[3] = new Cachorro();
		barulhentos[4] = new Cachorro();
		barulhentos[5] = new Carro();
		barulhentos[6] = new Carro();
		barulhentos[7] = new Carro();
		barulhentos[8] = new Vuvuzela();
		barulhentos[9] = new Cachorro();
		
		sons(barulhentos);
	}
	public static void sons(Barulhento[] barulhentos) {
		for(Barulhento b: barulhentos) {
			System.out.println(b.fazerBarulho());
		}
		
	}

}
