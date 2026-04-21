class TicTacToe {

    public static void main(String[] args) {
        int slot = 7; // example

        int row = getRowFromSlot(slot);
        int col = getColFromSlot(slot);

        System.out.println("Slot: " + slot);
        System.out.println("Row: " + row);
        System.out.println("Column: " + col);
    }

    // Convert slot to row
    static int getRowFromSlot(int slot) {
        return (slot - 1) / 3;
    }

    // Convert slot to column
    static int getColFromSlot(int slot) {
        return (slot - 1) % 3;
    }
}