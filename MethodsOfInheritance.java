abstract class Plane {
    abstract void takeOff();
    abstract void fly();
    abstract void land();
}

class CargoPlane extends Plane {
    void takeOff() {
        System.out.println("CargoPlane is taking off");
    }
    void fly() {
        System.out.println("CargoPlane is flying at low heights");
    }
    void land() {
        System.out.println("CargoPlane is landing");
    }
}

class PassengerPlane extends Plane {
    void takeOff() {
        System.out.println("PassengerPlane is taking off");
    }
    void fly() {
        System.out.println("PassengerPlane is flying at medium heights");
    }
    void land() {
        System.out.println("PassengerPlane is landing");
    }
}

class Airport {
    void permit(Plane ref) {
        ref.takeOff();
        ref.fly();
        ref.land();
    }
}

public class MethodsOfInheritance {
    public static void main(String[] args) {
        CargoPlane cp = new CargoPlane();
        PassengerPlane pp = new PassengerPlane();
        Airport a = new Airport();
        
        a.permit(cp);
        a.permit(pp);
    }
}