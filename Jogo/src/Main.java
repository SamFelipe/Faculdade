import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char[][] tabuleiro = new char[3][3];

        System.out.println("BEM VINDO AO JOGO DA VELHA!\n" +
                "PARA JOGAR VOCE DEVE ESCOLHER A\n" +
                "LINHA E COLUNA CORRESPONDENTES\n" +
                "AO TABULEIRO. BOA SORTE!\n");
        System.out.print("Nome do jogador 1: ");
        String jogador1 = input.nextLine();
        System.out.print("Nome do jogador 2: ");
        String jogador2 = input.nextLine();


        for(int i=0; i < 3; i++) {
            for(int j=0; j < 3; j++) {
                tabuleiro[i][j] = ' ';
            }
        }




        System.out.println("-------------");

        for(int i=0; i < 3; i++) {
            System.out.print("| ");
            for(int j=0; j < 3; j++) {
                System.out.print(tabuleiro[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }


        while(true) {
            System.out.println(jogador1 + ", insira seu movimento (linha, coluna): ");
            int linha = input.nextInt();
            int coluna = input.nextInt();


            tabuleiro[linha][coluna] = 'X';


            System.out.println("-------------");
            for(int i=0; i < 3; i++) {
                System.out.print("| ");
                for(int j=0; j < 3; j++) {
                    System.out.print(tabuleiro[i][j] + " | ");
                }
                System.out.println();
                System.out.println("-------------");
            }

            if(checkWinner(tabuleiro, 'X')) {
                System.out.println(jogador1 + " ganhou!");
                break;
            }

            System.out.println(jogador2 + ", insira seu movimento (linha, coluna): ");
            linha = input.nextInt();
            coluna = input.nextInt();

            tabuleiro[linha][coluna] = 'O';

            System.out.println("-------------");
            for(int i=0; i < 3; i++) {
                System.out.print("| ");
                for(int j=0; j < 3; j++) {
                    System.out.print(tabuleiro[i][j] + " | ");
                }
                System.out.println();
                System.out.println("-------------");
            }


            if(checkWinner(tabuleiro, 'O')) {
                System.out.println(jogador2 + " ganhou!");
                break;
            }
        }
    }

    public static boolean checkWinner(char[][] tabuleiro, char jogador) {

        //linha
        for(int i=0; i < 3; i++) {
            if(tabuleiro[i][0] == jogador && tabuleiro[i][1] == jogador && tabuleiro[i][2] == jogador) {
                return true;
            }
        }

        //coluna
        for(int j=0; j < 3; j++) {
            if(tabuleiro[0][j] == jogador && tabuleiro[1][j] == jogador && tabuleiro[2][j] == jogador) {
                return true;
            }
        }


        //diagonal
        if(tabuleiro[0][0] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][2] == jogador) {
            return true;
        }
        if(tabuleiro[2][0] == jogador && tabuleiro[1][1] == jogador && tabuleiro[0][2] == jogador) {
            return true;
        }

        return false;
    }
}