public class Client {
    public static void main(String[] args){
        SingletonFactory sf = SingletonFactory.getInstance();
        IVehicleFactory vf = sf.getFactory("Bike");
        IVehicle vehicle1 = vf.createVehicle();
        System.out.println(vehicle1.toString());
    }
}
