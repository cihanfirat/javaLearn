public class BikeFactory implements IVehicleFactory{

    @Override
    public IVehicle createVehicle(){
        return new Bike();
    }
}
