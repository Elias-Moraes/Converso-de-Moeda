package conversor;

import javax.swing.JOptionPane;

public class Conversor {

	ConversorMoedas moedas = new ConversorMoedas();

	public void converteMoeda(double valorRecebido) {

		String[] opcoes = { "Dollar para Real", "Euro para Real", "Libras Esterlinas para Real",
				"Peso argentino para Real", "Peso chileno para Real", "Real para Dollar", "Real para Euro",
				"Real para Libras Esterlinas", "Real para Peso argentino", "Real para Peso chileno" };
		String escolha = (String) JOptionPane.showInputDialog(null, "Escolha a moeda para a qual você deseja converter",
				"Moedas", -1, null, opcoes, opcoes[0]);

		switch (escolha) {
		case "Dollar para Real":
			moedas.dolarAReal(valorRecebido);
			break;
		case "Euro para Real":
			moedas.euroAReal(valorRecebido);
			break;
		case "Libras Esterlinas para Real":
			moedas.libraAReal(valorRecebido);
			break;
		case "Peso argentino para Real":
			moedas.pesoArgentinoAReal(valorRecebido);
			break;
		case "Peso chileno para Real":
			moedas.pesoChilenoAReal(valorRecebido);
			break;
		case "Real para Dollar":
			moedas.realADolar(valorRecebido);
			break;
		case "Real para Euro":
			moedas.realAEuro(valorRecebido);
			break;
		case "Real para Libras Esterlinas":
			moedas.realALibra(valorRecebido);
			break;
		case "Real para Peso argentino":
			moedas.realaPesoArgentino(valorRecebido);
			break;
		case "Real para Peso chileno":
			moedas.realAPesoChileno(valorRecebido);
			break;
		}

	}

	ConversorTemperatura temperatura = new ConversorTemperatura();

	public void converteTemperatura(double valorRecebido) {

		String[] opcoes = { "Celsius para Fahrenheit", "Celsius para Kelvin", "Fahrenheit para Celsius",
				"Fahrenheit para Kelvin", "Kelvin para Celsius", "Kelvin para Fahrenheit" };

		String escolha = (String) JOptionPane.showInputDialog(null,
				"Escolha que tipo de conversão de temperatura gostaria de fazer ", "Tipos de Conversão", -1, null,
				opcoes, opcoes[0]);

		switch (escolha) {
		case "Celsius para Fahrenheit":
			temperatura.celsiusAFahrenheit(valorRecebido);
			break;
		case "Celsius para Kelvin":
			temperatura.celsiusAKelvin(valorRecebido);
			break;
		case "Fahrenheit para Celsius":
			temperatura.fahrenheitACelsius(valorRecebido);
			break;
		case "Fahrenheit para Kelvin":
			temperatura.fahrenheitAKelvin(valorRecebido);
			break;
		case "Kelvin para Celsius":
			temperatura.kelvinACelsius(valorRecebido);
			break;
		case "Kelvin para Fahrenheit":
			temperatura.kelvinAFahrenheit(valorRecebido);
			break;
		}

	}

}
