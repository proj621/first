import java.util.Scanner;

class ReverseNumber {
    public static void main(String[] args) {
        Scanner re = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = re.nextInt();
        int reverse = 0;

        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }

        System.out.println("Reversed Number: " + reverse);
        re.close();
    }
}
