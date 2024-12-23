public class HomeConcereteFlyweight implements IHome{
    public String homeType;
    public HomeConcereteFlyweight(String homeType){
        this.homeType=homeType;
    }
    @Override
    public void design(String detail){
        System.out.println("Home Type: " + homeType + ", Details: " + detail);
    }
}
