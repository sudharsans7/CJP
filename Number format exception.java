public class Main {
    public static void main(String[] args) {
        try {
            String numberString = "abc";
            int number = Integer.parseInt(numberString);
            System.out.println("Number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
