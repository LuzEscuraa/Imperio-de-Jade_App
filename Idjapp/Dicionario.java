package Idjapp;

import java.util.Scanner;

public class Dicionario {
	
//dicion�rio que serve de sum�rio para locais importantes do universo de Tormenta o imperio de jade
	public Dicionario(){
		Scanner sc = new Scanner(System.in);
		int choose;
		//Estrutura de decis�o com estrutura de repeti��o para menu interativo
		//que se repete automaticamente se a resposta informada for inv�lida
		do {
			System.out.println("Selecione o termo que gostaria de buscar significado"
					+ "\n 1 Shirokita"
					+ "\n 2 Kaiju'Umi"
					+ "\n 3 Trono de Sugora"
					+ "\n 4 Dai'Soogen"
					+ "\n 5 Tayou'Umi"
					+ "\n 6 Yamadori"
					+ "\n 7 Hikari no Kishi"
					+ "\n 8 Kiri'Kizu"
					+ "\n 9 Shinkyo"
					+ "\n 10 Budo'tsu"
					+ "\n 11 Krrat'Karr"
					+ "\n 12 Ramkami"
					+ "\n 13 Nishidori");
			choose = sc.nextInt();
			switch(choose) {
			case 1://Shirokita
				System.out.println("Norte Branco, Regi�o montanhosa extremamaente gelada, distante de �reas povoadas. Praticamente se mistura com o norte congelado de Arton.");
				break;
			case 2://Kaiju'Umi
				System.out.println("Mar de Monstros, mar que separa a ilha do continente, distancia curta mais perigosa, a maior parte dos desastres naturais saem dali");
				break;
			case 3://Trono de Sugora
				System.out.println("Montanhas sangrentas");
				break;
			case 4://Dai'Soogen
				System.out.println("A Grande Estepe, Centenas de quil�metros de plan�cie temperada. Fria, �rida, quase desertica. Lar de antigos povos n�mades, hordas errantes,"
						+ "capazes de domesticar e cavalgar ferozes criaturas. Barbaros do norte gelado poderiam ter sido os primeiros povos humanos da ilha.");
				break;
			case 5://Tayou'Umi
				System.out.println("O Mar do Sol. �guas muito mais gentir, mesmo levando a parte alguma, local de pesca");
				break;
			case 6://Yamadori
				System.out.println("Antiga capital do imp�rio,");
				break;
			case 7://Hikari no Kishi
				System.out.println("cavaleiro da luz lendario Orion Drake lider do ex�rcito divino.");
				break;
			case 8://Kiri'Kizu
				System.out.println("Local onde deuses e demonios lutaram, a Ferida profunda");
				break;
			case 9://Shinkyo
				System.out.println("Shin'Yumeng ou Shinkyo Capital do imp�rio");
				break;
			case 10://Budo'Tsu
				System.out.println("O monasterio eterno, procurado por artistas marciais do mundo inteiro");
				break;
			case 11://KRRAT'KARR
				System.out.println("A Cidade Nezumi, originalmente chamada de Nezumi-Cho quanto menos se falar no assunto, melhor.");
				break;
			case 12://Rankami
				System.out.println("A cidade peridada, cidade destruida pela tormenta");
				break;
			case 13://Nishidori
				System.out.println("A fortaleza do oeste, antes uma imensa fortifica��o com o prop�sito de proteger o Imp�rio "
						+ "contra os kaiju do oeste, segunda cidade mais populosa da ilha");
				break;
			default:
				System.out.println("***ERRO*** Resultado n�o encontrado");
				System.out.println("");
				System.out.println("");
				break;
			}
		}while(choose != 1 && choose != 2 && choose != 3 && choose != 4 && choose != 5 && choose != 6 
				&& choose != 7 && choose != 8 && choose != 9 && choose != 10 && choose != 11 && choose != 12 && choose != 13);
	}
}	
