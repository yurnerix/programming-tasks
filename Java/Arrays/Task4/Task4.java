package Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[][] theaterSeating = new int[2][3];

        int seatNumber = 1;
        for (int row = 0; row < theaterSeating.length; row++) {
            for (int col = 0; col < theaterSeating[row].length; col++) {
                theaterSeating[row][col] = seatNumber++;
            }
        }

        System.out.println(theaterSeating[1][0]);
    }
}
