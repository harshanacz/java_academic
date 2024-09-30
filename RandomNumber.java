import java.util.Random;

public class RandomNumber {
    public void printMessage() {
        Random random = new Random(); 
        int number = random.nextInt(100);
        System.out.println("Random number: " + number);
    }
}
