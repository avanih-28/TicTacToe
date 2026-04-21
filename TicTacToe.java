class TicTacToe {

    static char[][] board = new char[3][3];

    public static void main(String[] args) {
        initializeBoard();
        printBoard();
    }

    static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    static void printBoard() {
        System.out.println("Tic-Tac-Toe Board:");

        for (int i = 0; i < 3; i++) {
            System.out.print(" ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);

                if (j < 2) {
                    System.out.print(" | ");
                }
            }
            System.out.println();

            if (i < 2) {
                System.out.println("---+---+---");
            }
        }
    }
}