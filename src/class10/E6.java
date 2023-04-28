package class10;

public class E6 {
    public static void main(String[] args) {
        int[] numbers={6,7,8,9};
        int largest=numbers[0];
        for (int i = 0; i <numbers.length ; i++) {

            if (numbers[i] > largest) {
                largest=numbers[i];
            }

        }
        System.out.println(largest);

    }
}
