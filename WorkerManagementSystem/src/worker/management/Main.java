package worker.management;

public class Main {
    public static void main(String[] args) {
        Worker robotWorker = new Robot();
        robotWorker.work();
        // robotWorker.eat(); // This line would cause a compilation error because Robot does not implement Eater

        Worker humanWorker = new Human();
        humanWorker.work();

        Eater humanEater = (Eater) humanWorker;
        humanEater.eat();
    }
}

