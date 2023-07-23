public class ServiceStationImpl implements ServiceStation {
    @Override
    public void check(Vehicle vehicle) {
        System.out.println("Обслуживаем " + vehicle.getModelName());
        vehicle.service();
    }
}