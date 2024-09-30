import java.util.ArrayList;
import java.util.Scanner;

public class Main { 
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- SMS Starting ---");

        for(int i = 0; i < 5; i++) {
            System.out.println("Enter Student " + (i + 1) + " Details:");
            
            // Name
            System.out.println("Enter Student Name:");
            String name = scanner.nextLine();
            
            // Marks
            System.out.println("Enter Student Marks:");
            int marks = scanner.nextInt();
            scanner.nextLine();
            
            // Create Student object
            Student student = new Student(name, marks);
            students.add(student);
        }
        
        scanner.close();

        System.out.println("Finished");
       
        if(students.size() > 0) {
            System.out.println("Students List:");
            for(Student student : students) {
                System.out.println("Name: " + student.name + ", Marks: " + student.mark);
            }
        }

    }
}
