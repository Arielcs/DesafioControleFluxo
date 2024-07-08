package contador;

import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		try {
			Scanner terminal = new Scanner(System.in);
			System.out.println("Digite o primeiro parâmetro");
			int paramUm = terminal.nextInt();
			System.out.println("Digite o segundo parâmetro");
			int paramDois = terminal.nextInt();
			contar(paramUm, paramDois);
		} catch (ParametrosInvalidosException e) {
			System.out.println(e.getMessage());
		}
	}

	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		new ValidadorParametro().validar(parametroUm, parametroDois);
		int contagem = parametroDois - parametroUm;
		for(int i = 1; i <= contagem; i++) {
			System.out.println("Imprimindo o número " + i);
		}
	}
}
