package Idjapp;

import java.util.Scanner;

//Informa quanto de experiencia falta para que o personagem avançe para o próximo nível
public class cdxp {
	public cdxp() {
			Scanner nt = new Scanner(System.in);
			int xplvl = 1000;
			int xpin= 0;
			int lvl;
			int i = 0;
			int xpu;
			int xpf;
			System.out.println("Informe o nível que deseja ir");
			lvl = nt.nextInt();
			//Estrutura de repetição que recebe os dados para calcular a quantidade de experiencia necessária para avançar de nivel
			for (; i < lvl; i++) {
				 i = xpin + (xplvl*(lvl-1));
				 System.out.println("o xp necessario para avançar do nivel " + (lvl-1) + " para o nível " + lvl + " é " + i); 
			}
			//Recebe a quantidade de xp possuida pelo usuário e informa quanto ele precisa pra chegar ao proximo nivel
			System.out.println("Insira a quantidade de xp que você possui");
			xpu = nt.nextInt();
			xpf = i - xpu;
			System.out.println("Faltam " + xpf + " de exp para alcançar o nivel " + lvl);

	}

}