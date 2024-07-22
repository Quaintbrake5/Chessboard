// package io.github.jiangdequan;

public class ChessBoard {
    public static void main (String[] args){
        int size = 8;
        char[][] board = new char[size][size];

        //To ensure the board comes in white and black
        for(int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if ((i + j) % 2 == 0){
                    board[i][j] = 'B'; // B means black 
                } else {
                    board[i][j] = 'W'; // W means white
                }
            }
        }

        //To print the board
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
