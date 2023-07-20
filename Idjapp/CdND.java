package Idjapp;

import java.util.Scanner;

public class CdND {
//Informa a quantidade de xp recebido em determinado encontro
	int ND;
	int quantidade;
	int exp;
	int participantes;
	public CdND() {
		Scanner nd = new Scanner(System.in);
		int esc;
//Recebe dados de Quantidade, Nivel de Dificuldade das criaturas e Número de Participantes para calcular o XP recebido
			System.out.println("Insira o ND das criaturas");
			ND = nd.nextInt();
			System.out.println("Insira a quantidade das criaturas");
			quantidade = nd.nextInt();
			System.out.println("Insira o numero de participantes");
			participantes = nd.nextInt();

			exp = ((ND * quantidade)*300)/participantes;

System.out.println(exp);
	}
}

