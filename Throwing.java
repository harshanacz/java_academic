public class Throwing {
    static void checkAge(int age) throws ArithmeticException {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        } else {
            System.out.println("Access granted!");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(18);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}