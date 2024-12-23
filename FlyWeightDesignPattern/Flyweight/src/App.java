public class App {
    public static void main(String[] args) throws Exception {
        HomeFactory hf = new HomeFactory();
        IHome bungalov = hf.getHome("Bungalov");
        IHome apartment =hf.getHome("Apartment");
        IHome farmhouse =hf.getHome("Farmhouse");

        bungalov.design("sea view");
        apartment.design("5 floors");
        farmhouse.design("large garden");

        IHome apartment2 = hf.getHome("Apartment");
        apartment2.design("10 floors");
        //no need to create an extra object since "apartment" is in the pool
    }
}
