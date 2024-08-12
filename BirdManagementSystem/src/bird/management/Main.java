package bird.management;

public class Main {
    public static void main(String[] args) {
        Bird sparrow = new Sparrow();
        sparrow.eat();
        ((FlyingBird) sparrow).fly(); // Valid as sparrow is a FlyingBird

        Bird ostrich = new Ostrich();
        ostrich.eat();
        // ((FlyingBird) ostrich).fly(); // Uncommenting this line will cause a ClassCastException
    }
}
