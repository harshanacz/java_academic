interface A {
    void methodA();
}

interface B {
    void methodB();
}

class MyClass implements A, B { 
    @Override
    public void methodA() {
        System.out.println("Method A");
    }

    @Override
    public void methodB() {
        System.out.println("Method B");
    }
}

