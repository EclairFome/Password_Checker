import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter password");

        String password = myObj.nextLine();
        if (password.equals("12345")) {
            System.out.println("Correct password");
        } else {
            System.out.println("Incorrect password");
        }
    }
}