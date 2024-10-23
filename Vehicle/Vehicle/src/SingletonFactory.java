public class SingletonFactory {
    public static SingletonFactory instance;
    private SingletonFactory(){}
    public static SingletonFactory getInstance(){
        if(instance==null){
            return new SingletonFactory();
        }else{
            return instance;
        }
    }
    public IVehicleFactory getFactory(String vehicleType){
        if(vehicleType=="Car"){
            IVehicleFactory vf = new CarFactory();
            return vf;
        }else if(vehicleType=="Bike"){
            IVehicleFactory vf = new BikeFactory();
            return vf;
        }else{
            return null;
        }
    }
}
