package Arrays;

import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) {
        char[][] field = new char[10][10];

        for (int i = 0; i < field.length; i++) {
            Arrays.fill(field[i], '.');
        }

        // Препятствия
        field[2][3] = '#';
        field[4][4] = '#';
        field[7][1] = '#';

        for (char[] row : field) {
            for (char cell : row) {
                System.out.print(cell);
            }
            System.out.println();
        }
    }
}
