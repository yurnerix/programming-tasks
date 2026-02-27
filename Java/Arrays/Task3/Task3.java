package Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] itemPrices = {5, 7, 2, 9};

        int total = 0;
        for (int price : itemPrices) {
            total += price;
        }

        System.out.println(total);
    }
}
