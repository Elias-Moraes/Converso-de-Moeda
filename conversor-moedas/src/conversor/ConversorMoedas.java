package conversor;

import javax.swing.JOptionPane;

public class ConversorMoedas {

	public void realADolar(double valor) {
		double dolar = valor / 4.85; // USD = 4.85
		dolar = (double) Math.round(dolar * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem $ " + dolar + " Dolares");

	}

	public void realAEuro(double valor) {
		double euro = valor / 5.37; // EUR 5.37
		euro = (double) Math.round(euro * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem o total de $ " + euro + "  Em Euros");

	}

	public void realALibra(double valor) {
		double libra = valor / 6.21; // GBP = 6.21
		libra = (double) Math.round(libra * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem o total de $ " + libra + " Em Libras Esterina");

	}

	public void realaPesoArgentino(double valor) {
		double pesoArgentino = valor / 0.017; // ARS = 0.017
		pesoArgentino = (double) Math.round(pesoArgentino * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem o total de $ " + pesoArgentino + " Em Pesos Argentinos");

	}

	public void realAPesoChileno(double valor) {
		double pesoChileno = valor / 0.0057; // CLP = 0.0057
		pesoChileno = (double) Math.round(pesoChileno * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem o total de $ " + pesoChileno + " Em Peso Chileno");
	}

	public void dolarAReal(double valor) {
		double real = valor * 4.85; // USD = 4.85
		real = (double) Math.round(real * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem o total de $" + real + " Em Reais");

	}

	public void euroAReal(double valor) {
		double real = valor * 5.37; // EUR 5.37
		real = (double) Math.round(real * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem o total de $ " + real + "  Em Reais");

	}

	public void libraAReal(double valor) {
		double real = valor * 6.21; // GBP = 6.21
		real = (double) Math.round(real * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem o total de $ " + real + " Em Reais");

	}

	public void pesoArgentinoAReal(double valor) {
		double real = valor * 0.017; // ARS = 0.017
		real = (double) Math.round(real * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem o total de $ " + real + " Em Pesos Reais");

	}

	public void pesoChilenoAReal(double valor) {
		double real = valor * 0.0057; // CLP = 0.0057
		real = (double) Math.round(real * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem o total de $ " + real + " Em Pesos Reais");
	}

}
