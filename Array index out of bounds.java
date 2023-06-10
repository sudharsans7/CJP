public class Main {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            int index = 5;
            int value = numbers[index];
            System.out.println("Value: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
