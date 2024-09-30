import java.util.Scanner; 

public class MakeScanner {
    public void printMessage() {
        Scanner scanner = new Scanner(System.in);  
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("You entered: " + number);
    }
}
