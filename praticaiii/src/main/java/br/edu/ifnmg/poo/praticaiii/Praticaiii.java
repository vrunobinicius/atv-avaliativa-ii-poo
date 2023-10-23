/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.edu.ifnmg.poo.praticaiii;

/**
 *
 * @author bvan &lt;Bruno Vinícius at ifnmg&gt;
 */
public class Praticaiii {
    public static void main(String[] args) {
        Board board = new Board();
        board.initBoard();
        board.mover(1, 0, 0);
        board.printBoard();
    }
}
