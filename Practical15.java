abstract class Vehicle {

    abstract void start();

    void stop() {
        System.out.println("Vehicle stopped.");
    }
}

interface MusicSystem {

    void playMusic();
}

class Car extends Vehicle implements MusicSystem {

    public void start() {
        System.out.println("Car starts with a key.");
    }

    public void playMusic() {
        System.out.println("Music system is playing.");
    }
}

class Practical15 {

    public static void main(String[] args) {

        Car c = new Car();

        c.start();
        c.playMusic();
        c.stop();

        System.out.println("Multiple inheritance is achieved using interfaces.");
    }
}
