package conversor;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {

		boolean entradaValida = false;
		int numero = 0;
		String valor = "";

		String escolha = (JOptionPane.showInputDialog(null, "Escolha uma opção:", "Menu", JOptionPane.PLAIN_MESSAGE,
				null, new Object[] { "Conversor de Moeda", "Conversor de Temperatura" }, null)).toString();

		while (!entradaValida) {
			try {
				valor = JOptionPane.showInputDialog(null, "Digite um número:");

				if (valor == null) {
					// O usuário cancelou a caixa de diálogo
					System.exit(0);
				} else {
					numero = Integer.parseInt(valor);
					entradaValida = true;
				}
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Por favor, digite um número inteiro válido!");
			}
		}

		Conversor conversor = new Conversor();

		switch (escolha) {
		case "Conversor de Moeda":
			double valorRecebido = Double.parseDouble(valor);
			conversor.converteMoeda(valorRecebido);
			int resposta = JOptionPane.showConfirmDialog(null, "Deseja Continuar");
			if (resposta == JOptionPane.OK_OPTION) {
				main(args);

			} else {
				JOptionPane.showMessageDialog(null, "Volte Sempre!");
				System.exit(0);
			}
		case "Conversor de Temperatura":
			valorRecebido = Double.parseDouble(valor);
			conversor.converteTemperatura(valorRecebido);
			resposta = JOptionPane.showConfirmDialog(null, "Deseja Continuar");
			if (resposta == JOptionPane.OK_OPTION) {
				main(args);

			} else {
				JOptionPane.showMessageDialog(null, "Volte Sempre !");
				System.exit(0);
			}

		}

	}
}
