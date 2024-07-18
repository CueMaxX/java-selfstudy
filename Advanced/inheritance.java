package Advanced;

class Machines {
    public void start(){
        System.out.println("Machine Started");
    }
    public void stop(){
        System.out.println("Machine Stopped");
    }
}

class Car extends Machines {
    public void start(){
        System.out.println("Car Started");
    }
    public void wipeWindShield(){
        System.out.println("Wiping Wind Shield");
    }
}

public class inheritance {
    public static void main(String[] args) {
        Machines m1 = new Machines();
        m1.start();
        m1.stop();

        Car c1 = new Car();
        c1.start();
        c1.wipeWindShield();
        c1.stop();

    }
}
