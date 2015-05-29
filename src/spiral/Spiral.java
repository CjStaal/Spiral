/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spiral;

/**
 *
 * @author Charles
 */
public class Spiral {

    private char[][] board;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Spiral test = new Spiral();
        test.start(7);
    }

    public void start(int size) {
        board = new char[size][size];
        this.drawTop(0, 0, size);
    }

    private void drawTop(int x, int y, int size) {
        for (int counter = 0; counter < size; counter++, x++) {
            board[x][y] = '*';
            if (counter != size - 1) {
                x++;
            }
        }
        if (--size > 0) {
            this.drawRight(x, ++y, size);
        } else {
            printBoard();
        }
    }

    private void drawRight(int x, int y, int size) {
        for (int counter = 0; counter < size; counter++) {
            board[x][y] = '*';
            if (counter != size - 1) {
                y++;
            }
        }
        if (--size > 0) {
            this.drawBottom(--x, y, size);
        } else {
            printBoard();
        }
    }

    private void drawBottom(int x, int y, int size) {
        for (int counter = 0; counter < size; counter++) {
            board[x][y] = '*';
            if (counter != size - 1) {
                x--;
            }
        }
        if (--size > 0) {
            this.drawLeft(x, --y, size);
        } else {
            printBoard();
        }
    }

    private void drawLeft(int x, int y, int size) {
        for (int counter = 0; counter < size; counter++) {
            board[x][y] = '*';
            if (counter != size - 1) {
                y--;
            }
        }
        if (--size > 0) {
            this.drawTop(++x, y, size);
        } else {
            printBoard();
        }
    }

    private void printBoard() {
        for (int y = 0; y < board.length; y++) {
            for (int x = 0; x < board.length; x++) {
                System.out.print(board[x][y]);
            }
            System.out.println();
        }
    }
}
