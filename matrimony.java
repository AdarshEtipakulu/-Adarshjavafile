import java.util.Scanner;
public class Matrimony {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your gender :");
        String gender = scanner.nextLine();
        System.out.println("Enter your age:");
        int age = scanner.nextInt();
        if (gender.equalsIgnoreCase("male")) {
            if (age >= 21) {
                System.out.println("Eligible for marriage");
            } else {
                System.out.println("Not eligible for marriage (Age must be 21 or older)");
            }
        } 
        else if (gender.equalsIgnoreCase("female")) {
            if (age >= 18) {
                System.out.println("Eligible for marriage");
            } else {
                System.out.println("Not eligible for marriage (Age must be 18 or older)");
            }
        } 
        else {
            System.out.println("Invalid gender entered");
        }
        scanner.close();
    }
}
