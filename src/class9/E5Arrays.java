package class9;

public class E5Arrays {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i += 2) {
            System.out.print(i + " ");
        }

        System.out.println();
        char[] symbol = {'a', 'b', 'c', 'd', 'e'};
        for (int j = 0; j < symbol.length; j += 2) {
            System.out.print(symbol[j] + " ");


        }
    }
}