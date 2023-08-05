package conversor;

import javax.swing.JOptionPane;

public class ConversorTemperatura {

	public void celsiusAFahrenheit(double valor) {
		double fahrenheit = (valor * 1.8) + 32;
		fahrenheit = (double) Math.round(fahrenheit * 100d) / 100;
		JOptionPane.showMessageDialog(null, "A temperatura em Fahrenheit é : " + fahrenheit);

	}

	public void celsiusAKelvin(double valor) {
		double kelvin = valor + 273;
		kelvin = (double) Math.round(kelvin * 100d) / 100;
		JOptionPane.showMessageDialog(null, "A temperatura em Kelvin é : " + kelvin);
	}

	public void fahrenheitACelsius(double valor) {
		double celsius = (valor - 32) / 1.8;
		celsius = (double) Math.round(celsius * 100d) / 100;
		JOptionPane.showMessageDialog(null, "A temperatura em Celsius é :  " + celsius);
	}

	public void fahrenheitAKelvin(double valor) {
		double kelvin = ((valor - 32) * 5 / 9) + 32;
		kelvin = (double) Math.round(kelvin * 100d) / 100;
		JOptionPane.showMessageDialog(null, "A temperatura em Kelvin é : " + kelvin);
	}

	public void kelvinAFahrenheit(double valor) {
		double fahrenheit = (valor - 273) * 1.8 + 32;
		fahrenheit = (double) Math.round(fahrenheit * 100d) / 100;
		JOptionPane.showMessageDialog(null, "A temperatura em Fahrenheit é :  " + fahrenheit);

	}

	public void kelvinACelsius(double valor) {
		double celsius = (valor - 273);
		celsius = (double) Math.round(celsius * 100d) / 100;
		JOptionPane.showMessageDialog(null, "A temperatura em Celsius é :  " + celsius);

	}

}
