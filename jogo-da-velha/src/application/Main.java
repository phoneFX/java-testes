package application;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);

		Jogo jogo = new Jogo(false);
		
		
		
		
		 while(jogo.fimDeJogo == false) {
				
			
			jogo.layout();
			System.out.println();
			if (jogo.fimDeJogo == false) {		
				System.out.print("Escolha a linha:");
				int linha = sc.nextInt();
				System.out.print("Escolha a coluna:");
				int coluna = sc.nextInt();
				System.out.println();
				
				jogo.jogadaValida(linha, coluna);
			}
			
			
		 }
			
		
		
		sc.close();
		
	}

}


class Jogo{
	
	boolean fimDeJogo = false;
	String[][] jogo = new String[3][3];
	String jogadorAtual = "x";
	
	
	private void trocarDeJogador() {
		jogadorAtual = (jogadorAtual.equals("x")) ? "o" : "x";
	}
	
	public Jogo(boolean fimDeJogo) {
		this.fimDeJogo = fimDeJogo;
		for(int i = 0; i < 3 ; i++) {
			for (int j = 0; j < 3; j++) {
				jogo[i][j] = "#";
			}
		}
	}
	
	public boolean jogadaValida(int linha, int coluna) {
		
		if ((linha >= 0 && linha < 3) && (coluna >= 0 && coluna < 3)) {
			if (jogo[linha][coluna].equals("#")) {
				jogo[linha][coluna] = jogadorAtual;
				trocarDeJogador();
				return true;
			}
			else {
				System.out.println("jogada invalida!");
				return false;
			}
		}
		else {
			System.out.println("jogada invalida!");
			return false;
		}
		
				
	}
	
	
	public void layout() {
	
		
		verificarVencedor();
		for (int i = 0; i < 3; i++) {
			System.out.print("  " + i);
		}
	

		for(int i = 0; i < 3; i++) {
			System.out.println();
			System.out.print(i + "");
		
				for (int j = 0; j < 3; j++) {
					if(jogo[i][j].equals("x")) {
						System.out.print(" x ");
					}
					else if(jogo[i][j].equals("o")){
						System.out.print(" o ");
					}
					else {
						System.out.print(" # ");
					}
				}	
				
				
		}
		
		
	}
	
	
	public void verificarVencedor() {
		
		int casasOcupadas = 0;
		
		if((jogo[0][0].equals("x") && jogo[0][1].equals("x") && jogo[0][2].equals("x")) || (jogo[1][0].equals("x") && jogo[1][1].equals("x") && jogo[1][2].equals("x"))||
		   (jogo[2][0].equals("x") && jogo[2][1].equals("x") && jogo[2][2].equals("x")) || (jogo[0][0].equals("x") && jogo[1][0].equals("x") && jogo[2][0].equals("x"))||
		   (jogo[0][1].equals("x") && jogo[1][1].equals("x") && jogo[2][1].equals("x")) || (jogo[0][2].equals("x") && jogo[1][2].equals("x") && jogo[2][2].equals("x"))||
		   (jogo[0][0].equals("x") && jogo[1][1].equals("x") && jogo[2][2].equals("x")) || (jogo[0][2].equals("x") && jogo[1][1].equals("x") && jogo[2][0].equals("x")) ) {
			
				System.out.println("JOGADOR X VENCEU!");
				fimDeJogo = true;
				
		}
		else if((jogo[0][0].equals("o") && jogo[0][1].equals("o") && jogo[0][2].equals("o")) || (jogo[1][0].equals("o") && jogo[1][1].equals("o") && jogo[1][2].equals("o"))||
		   	   (jogo[2][0].equals("o") && jogo[2][1].equals("o") && jogo[2][2].equals("o")) || (jogo[0][0].equals("o") && jogo[1][0].equals("o") && jogo[2][0].equals("o")) ||
		       (jogo[0][1].equals("o") && jogo[1][1].equals("o") && jogo[2][1].equals("o")) || (jogo[0][2].equals("o") && jogo[1][2].equals("o") && jogo[2][2].equals("o")) ||
		       (jogo[0][0].equals("o") && jogo[1][1].equals("o") && jogo[2][2].equals("o")) || (jogo[0][2].equals("o") && jogo[1][1].equals("o") && jogo[2][0].equals("o")) ){
			
					System.out.println("JOGADOR O VENCEU!");
					fimDeJogo = true;
		      
		}
		else {
			for (int i = 0; i < jogo.length; i++) {
				for (int j = 0; j < jogo.length; j++) {
					if (!jogo[i][j].equals("#")) {
						casasOcupadas++;
					}
				}
			}
			
			if(casasOcupadas == 9) {
				System.out.println("EMPATE!");
				fimDeJogo = true;
			}
			
		}
		
		
		
		
		
	}
	
		
		
		
		
}
