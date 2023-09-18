import java.util.Scanner;

public class FakePhoneNo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.nextLine();
        // Write your code here
        for (int i = 0; i < N; i++) {
            String phoneNumber = scanner.nextLine();
            boolean isValid = isValidPhoneNumber(phoneNumber);
            System.out.println(isValid ? "True" : "False");
        }
    }

    // Function to check the validity of a phone number
    private static boolean isValidPhoneNumber(String phoneNumber) {
        // Check if the phone number starts with '+' or a digit, and contains only digits
        if (phoneNumber.length() > 0 && (phoneNumber.charAt(0) == '+')) {
            for (int i = 1; i < phoneNumber.length(); i++) {
                if (!Character.isDigit(phoneNumber.charAt(i))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
