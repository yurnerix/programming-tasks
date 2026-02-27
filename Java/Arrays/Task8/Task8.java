package Arrays;

public class Task8 {
    public static int[][][] multiArray = {
            { {4, 8, 15}, {16} },
            { {23, 42}, {} },
            { {1}, {2}, {3}, {4, 5} }
    };

    public static void main(String[] args) {
        for (int i = 0; i < multiArray.length; i++) {
            int[][] layer = multiArray[i];
            for (int j = 0; j < layer.length; j++) {
                for (int k = 0; k < layer[j].length; k++) {
                    System.out.print(layer[j][k] + " ");
                }
                System.out.println();
            }
            if (i < multiArray.length - 1) {
                System.out.println("-----");
            }
        }
    }
}
