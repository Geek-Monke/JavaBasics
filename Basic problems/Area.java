class rectangle {
    private int length;
    private int breadth;
    private int result;

    rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    int returnArea() {
        result = length * breadth;
        return result;
    }
}

class Area {
    public static void main(String[] args) {
        rectangle ob = new rectangle(5, 6);
        ob.returnArea();
        System.out.println("The area of the Rectangle is :- " + ob.returnArea());
    }
}