If a class is public, the file must have the same name as the public class.
you can have multiple classes in one file as long as only one of them is public.

-> Public Class:
Accessibility: Can be accessed from anywhere (any package).
Usage: Use when you want your class to be available globally.

-> Private Class:
Not Allowed: A top-level class cannot be private. You can only use private for inner classes.

eg -
public class OuterClass {
    private class InnerClass {
        void display() {
            System.out.println("This is private inner class.");
        }
    }
}


-> Default (Package-Private):
Accessibility: Can only be accessed within the same package.
Usage: Use when the class is only meant for internal use within its package.

eg- 
class MyPackageClass { // No 'public' keyword
    void display() {
        System.out.println("Accessible only within the same package.");
    }
}

