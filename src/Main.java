public class Main {
    public static void main(String[] args) {
        Car car = new Car("car1", 4);
        Car car2 = new Car("car2");
        Truck truck = new Truck("truck1", 6);
        Truck truck2 = new Truck("truck2", 8);
        Bicycle bicycle = new Bicycle("bicycle1", 2);
        Bicycle bicycle2 = new Bicycle("bicycle2", 2);

        ServiceStation serviceStationImpl = new ServiceStationImpl();

        serviceStationImpl.check(car);
        serviceStationImpl.check(car2);
        serviceStationImpl.check(bicycle);
        serviceStationImpl.check(bicycle2);
        serviceStationImpl.check(truck);
        serviceStationImpl.check(truck2);
    }
}