package Idjapp;

import java.util.Scanner;

public class Idjapp{
	public static void main(String[] args) {
		
		//Menu interativo que permite usuário escolher ação desejada
		int choose;
		do {
		int esc;
		Scanner em = new Scanner(System.in);
		do {
			System.out.println("Olá o que gostaria de fazer hoje ?"
					+ "\n 1 ver quanto de xp falta pro proximo nivel"
					+ "\n 2 ver o dicionário de termos tamurianos"
					+ "\n 3 Calcular ganho de exp"
					+ "\n 4 Gerar encontro aleatório");
			esc = em.nextInt();
			switch (esc) {
			case 1: {
				cdxp exp = new cdxp();
				break;
			}
			case 2:{
				Dicionario dic = new Dicionario();
				break;
			}
			case 3:{
				CdND end = new CdND();
				break;
			}
			case 4:{
				Gerador_de_Encontros ger = new Gerador_de_Encontros();
				break;
			}
			}
			//Resposta caso usuario digite opção inválida
			if(esc!= 1 && esc != 2 && esc != 3 && esc != 4){
				System.out.println("Opção não encontrada, tente novamente");
				System.out.println(" ");
			}
		}//resposta aparece depois que a operação é concluída se o usuário deseja mais operações retorna ao menu, se não o sistema é encerrado
		while(esc!= 1 && esc != 2 && esc != 3 && esc != 4);
		System.out.println(" ");
		System.out.println("Gostaria de algo mais ?"
				+ "\n 1 sim"
				+ "\n 2 não");
		choose = em.nextInt();
		}while(choose == 1);
		System.out.println("Até logo!");
	}
}

