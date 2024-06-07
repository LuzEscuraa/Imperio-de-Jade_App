package Idjapp;

import java.util.Random;
import java.util.Scanner;


//sistema gerador de encontros randomicos com limite de quantidade limit�do a 20 indiv�duos com o n�vel deles variando
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
		nv = qnt/dif;
		if(nv==0){
			nv = nv+1;
		}
		if(qnt == 0) {
			qnt = qnt +1;
		}
			System.out.println("Quantidade de inimigos = " + qnt + " de n�vel = " + nv);

	}
}