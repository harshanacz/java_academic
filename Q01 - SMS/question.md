# Practice Question: Student Management System

You are tasked with creating a **Student Management System**. Write a Java program that:

1. Asks the user to enter details for **5 students** (name and score).
2. Stores these student details in an array of **Student** objects.
3. Using an **if condition**, check if each student's score is **above 50**. If so, print **"Passed"**; otherwise, print **"Failed"**.
4. Use a **while loop** to allow the user to continue adding students until all 5 students' details are entered.

## Requirements:
- Create a **Student** class with two fields: `name` (String) and `score` (int).
- Use an **array of objects** to store the students.
- Use an **if** statement to check if the student passed or failed (based on a score threshold).
- Use a **while loop** to prompt the user to enter details for each student.

## Example Input/Output:

- Enter student name: John Enter student score: 85 John has Passed!

- Enter student name: Sarah Enter student score: 45 Sarah has Failed!

- Enter student name: Alice Enter student score: 75 Alice has Passed!

- (Continue until 5 students are entered)


## Hints:
1. Create a `Student` class with `name` and `score` attributes.
2. Use a `while` loop to enter 5 students.
3. Use an `if` statement to check if the score is greater than or equal to 50 for passing.
