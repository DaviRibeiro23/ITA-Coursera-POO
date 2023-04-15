import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Teste {

	double imcExpected;
	String diagnosticoExpected;

	Paciente p = new Paciente();

	@Test
	public void testarIMCDiagnosticoPaciente1() {

		p.setPeso(80);
		p.setAltura(1.80);
		
		imcExpected = 24.69;
		diagnosticoExpected = "Peso normal";

		assertEquals(imcExpected, p.calcularIMC(), 0.01);
		assertEquals(diagnosticoExpected, p.diagnostico());
	}

	@Test
	public void testarIMCDiagnosticoPaciente2() {
		p = new Paciente(90);

		p.getAltura(); // altura: 1.85
		double imcExpected = 26.30;
		diagnosticoExpected = "Sobrepeso";

		assertEquals(imcExpected, p.calcularIMC(), 0.01);
		assertEquals(diagnosticoExpected, p.diagnostico());
	}

	@Test
	public void testarIMCDiagnosticoPaciente3() {

		p.setPeso(120);
		p.setAltura(1.90);
		imcExpected = 33.24;
		diagnosticoExpected = "Obesidade grau I";

		assertEquals(imcExpected, p.calcularIMC(), 0.01);
		assertEquals(diagnosticoExpected, p.diagnostico());

	}
	@Test
	public void testarIMCDiagnosticoPaciente4() {

		p.setPeso(140);
		p.setAltura(1.90);
		imcExpected = 38.78;
		diagnosticoExpected = "Obesidade grau II";

		assertEquals(imcExpected, p.calcularIMC(), 0.01);
		assertEquals(diagnosticoExpected, p.diagnostico());

	}
	@Test
	public void testarIMCDiagnosticoPaciente5() {

		p.setPeso(120);
		p.setAltura(1.70);
		imcExpected = 41.52;
		diagnosticoExpected = "Obesidade morbida";

		assertEquals(imcExpected, p.calcularIMC(), 0.01);
		assertEquals(diagnosticoExpected, p.diagnostico());

	}
	@Test
	public void testarIMCDiagnosticoPaciente6() {

		p.setPeso(60);
		p.setAltura(1.90);
		imcExpected = 16.62;
		diagnosticoExpected = "Baixo peso grave";

		assertEquals(imcExpected, p.calcularIMC(), 0.01);
		assertEquals(diagnosticoExpected, p.diagnostico());

	}
	@Test
	public void testarIMCDiagnosticoPaciente7() {

		p.setPeso(57);
		p.setAltura(1.90);
		imcExpected = 15.78;
		diagnosticoExpected = "Baixo peso muito grave";

		assertEquals(imcExpected, p.calcularIMC(), 0.01);
		assertEquals(diagnosticoExpected, p.diagnostico());

	}
	@Test
	public void testarIMCDiagnosticoPaciente8() {

		p.setPeso(66);
		p.setAltura(1.90);
		imcExpected = 18.28;
		diagnosticoExpected = "Baixo peso";

		assertEquals(imcExpected, p.calcularIMC(), 0.01);
		assertEquals(diagnosticoExpected, p.diagnostico());

	}
}

