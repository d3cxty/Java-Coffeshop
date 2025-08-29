import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 'new' for Scanner
        char[][] board = new char[3][3]; // 3x3 board
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' '; // Initialize empty spaces
            }
        }

        int turn = 0; // 0 for X, 1 for O
        boolean gameWon = false;
        int moves = 0;

        while (!gameWon && moves < 9) {
            // Print board
            printBoard(board);

            // Determine current player
            char player = (turn % 2 == 0) ? 'X' : 'O';
            System.out.println("Player " + player + ", enter row (1-3):");
            int row = scanner.nextInt() - 1; // Adjust to 0-based index
            System.out.println("Enter column (1-3):");
            int col = scanner.nextInt() - 1;

            // Validate move
            if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ') {
                board[row][col] = player;
                moves++;

                // Check for win
                if (checkWin(board, player)) {
                    gameWon = true;
                    printBoard(board);
                    System.out.println("Player " + player + " wins!");
                } else if (moves == 9) {
                    printBoard(board);
                    System.out.println("It's a draw!");
                }
            } else {
                System.out.println("Invalid move! Try again.");
            }

            turn++;
        }

        scanner.close();
    }

    public static void printBoard(char[][] board) {
        System.out.println("  1 | 2 | 3");
        for (int i = 0; i < 3; i++) {
            System.out.print((i + 1) + " | ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
                if (j < 2) System.out.print(" | ");
            }
            System.out.println();
            if (i < 2) System.out.println("  ---------" );
        }
    }

    public static boolean checkWin(char[][] board, char player) {
        // Check rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                return true;
            }
        }
        // Check columns
        for (int j = 0; j < 3; j++) {
            if (board[0][j] == player && board[1][j] == player && board[2][j] == player) {
                return true;
            }
        }
        // Check diagonals
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }
        return false;
    }
}