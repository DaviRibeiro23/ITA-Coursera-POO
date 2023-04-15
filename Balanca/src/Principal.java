public class Principal {

	public static void main(String[] args) {
		
		Paciente p1 = new Paciente(80, 1.80);
		System.out.printf("IMC do paciente 1: %.2f", p1.calcularIMC());
		
		System.out.println();
		
		System.out.println(p1.diagnostico());
		
		
		Paciente p2 = new Paciente(90);
		p2.getAltura();
		System.out.println();
		System.out.printf("IMC do paciente 2: %.2f", p2.calcularIMC());
		
		System.out.println();
		
		System.out.println(p2.diagnostico());
		
		Paciente p3 = new Paciente();
		p3.setAltura(1.9);
		p3.setPeso(120);
		
		System.out.println();
		System.out.printf("IMC do paciente 3: %.2f", p3.calcularIMC());
		
		System.out.println();
		
		System.out.println(p3.diagnostico());
		
	}
}




