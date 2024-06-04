
class Animal {
    public void move() {
        System.out.println("Animal is moving.");
    }
}

class Cheetah extends Animal {
    @Override
    public void move() {
        System.out.println("Cheetah is running at full speed!");
    }
}

public class run {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.move();
        Cheetah cheetah = new Cheetah();
        cheetah.move();
    }
}
