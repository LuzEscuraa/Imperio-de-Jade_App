package Idjapp;

import java.util.Random;
import java.util.Scanner;


//sistema gerador de encontros randomicos com limite de quantidade limitádo a 20 indivíduos com o nível deles variando
//de acordo com o nivel de dificuldade informado
public class Gerador_de_Encontros {
	int dif;
	int qnt;
	int nv;
	public Gerador_de_Encontros() {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira escolha um valor entre 1 e vinte pra dificuldade");
		dif = sc.nextInt();
		qnt = rand.nextInt(20);
		nv = dif/qnt;
		System.out.println("Quantidade de inimigos = " + qnt + " de nível = " + nv);

	}
}