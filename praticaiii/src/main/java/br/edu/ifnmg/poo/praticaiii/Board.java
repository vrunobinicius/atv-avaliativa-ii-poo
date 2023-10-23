/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.poo.praticaiii;

/**
 *
 * @author bvan &lt;Bruno Vinícius at ifnmg&gt;
 */
public class Board {
    private int[][] theBoard;
    private int[] horizontal    = {2, 1, -1, -2, -2, -1, 1, 2};
    private int[] vertical      = {-1, -2, -2, -1, 1, 2, 2, 1};
    private int totalMovements  = 0;

    public Board() {
        this.theBoard = new int[8][8];
    }
    
    public void initBoard() {
        for (int i = 0; i < 8; i++) { for (int j = 0; j < 8; j++) { this.theBoard[i][j] = 0; } }
    }

    public void mover(int currentMovement, int currentRow, int currentColumn) {
        if (currentMovement > 64) return;

        if (currentRow < 0 || currentColumn < 0 || currentRow >= 8 || currentColumn >= 8) return;

        if (this.theBoard[currentRow][currentColumn] != 0) return;

        this.theBoard[currentRow][currentColumn] = currentMovement;
        
        this.totalMovements++;

        for (int i = 0; i < 8; i++) mover(currentMovement + 1, currentRow + vertical[i], currentColumn + horizontal[i]);

        if (this.totalMovements != 64) {
            this.theBoard[currentRow][currentColumn] = 0;
            this.totalMovements--;
        }
    }

    public void printBoard() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.printf("%02d ", this.theBoard[i][j]);
            }
            System.out.println();
        }
    } 
}
