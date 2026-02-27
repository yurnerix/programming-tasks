package Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[][] table = new int[10][10];

        for (int row = 0; row < table.length; row++) {
            for (int col = 0; col < table[row].length; col++) {
                table[row][col] = (row + 1) * (col + 1);
            }
        }

        for (int[] row : table) {
            for (int j = 0; j < row.length; j++) {
                System.out.print(row[j]);
                if (j < row.length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
