package Practice;

class A {
    void display() {
        System.out.println("The vehicle moves");
    }
}

class B extends A {
    void display() {
        super.display();
        System.out.println("The car moves");
    }
}

class C {

    public static void main(String args[]) {
        B obj = new B();
        obj.display();
    }
}