package Idjapp;

import java.util.Scanner;

//Informa quanto de experiencia falta para que o personagem avan�e para o pr�ximo n�vel
public class cdxp {
	public cdxp() {
			Scanner nt = new Scanner(System.in);
			int xplvl = 1000;
			int xpin= 0;
			int lvl;
			int i = 0;
			int xpu;
			int xpf;
			System.out.println("Informe o n�vel que deseja ir");
			lvl = nt.nextInt();
			//Estrutura de repeti��o que recebe os dados para calcular a quantidade de experiencia necess�ria para avan�ar de nivel
			for (; i < lvl; i++) {
				 i = xpin + (xplvl*(lvl-1));
				 System.out.println("o xp necessario para avan�ar do nivel " + (lvl-1) + " para o n�vel " + lvl + " � " + i); 
			}
			//Recebe a quantidade de xp possuida pelo usu�rio e informa quanto ele precisa pra chegar ao proximo nivel
			System.out.println("Insira a quantidade de xp que voc� possui");
			xpu = nt.nextInt();
			xpf = i - xpu;
			System.out.println("Faltam " + xpf + " de exp para alcan�ar o nivel " + lvl);

	}

}