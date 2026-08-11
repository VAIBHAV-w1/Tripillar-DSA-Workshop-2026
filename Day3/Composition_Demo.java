package Day3;

class Engine {

    void start() {
        System.out.println("Engine Started");
    }
}

class Car {

    private Engine engine;

    Car() {
        engine = new Engine();
    }

    void startCar() {
        engine.start();
        System.out.println("Car Started");
    }
}

public class Composition_Demo {

    public static void main(String[] args) {

        Car car = new Car();

        car.startCar();
    }
}