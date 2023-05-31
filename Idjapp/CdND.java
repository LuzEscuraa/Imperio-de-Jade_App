package Idjapp;

import java.util.Scanner;

public class CdND {

	int ND;
	int quantidade;
	int exp;
	public CdND() {
		Scanner nd = new Scanner(System.in);
		int esc;

		do {
			System.out.println("Insira o ND das criaturas");
			ND = nd.nextInt();
			System.out.println("Insira a quantidade das criaturas");
			quantidade = nd.nextInt();

			exp = (ND * quantidade)*300;



			System.out.println("Adicionar mais ?"
					+ "\n 1 Sim"
					+ "\n 2 Não");
			esc = nd.nextInt();
		} while (esc == 1); System.out.println(exp);
	}
}

