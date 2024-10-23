public class CarFactory implements IVehicleFactory{
    @Override
    public IVehicle createVehicle(){
        return new Car();
    }
}
