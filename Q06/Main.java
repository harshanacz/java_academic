
// class InvalidEmailException extends Exception {
//     InvalidEmailException(String message) {
//         super(message);
//     }
// }

// public class Main {
//     static void validateEmail(String email) throws InvalidEmailException {
//         if (!email.contains("@")) {
//             throw new InvalidEmailException("Invalid email: " + email);
//         } else {
//             System.out.println("Valid email: " + email);
//         }
//     }

//     public static void main(String[] args) {
//         try {
//             validateEmail("testexample.com"); 
//         } catch (InvalidEmailException e) {
//             System.out.println(e.getMessage());
//         }
//     }
// }