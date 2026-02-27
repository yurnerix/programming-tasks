package Arrays;

public class Task7 {
    public static void main(String[] args) {
        int[][] zoneTemperatures = {
                {22, 25, 28},
                {30, 27},
                {18, 24, 27, 29}
        };

        int maxTemp = Integer.MIN_VALUE;
        for (int[] zone : zoneTemperatures) {
            for (int t : zone) {
                if (t > maxTemp) {
                    maxTemp = t;
                }
            }
        }

        System.out.println("Самая высокая температура: " + maxTemp);
    }
}
