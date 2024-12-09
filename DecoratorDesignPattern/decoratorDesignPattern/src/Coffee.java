public class Coffee implements IBeverage{
    @Override
    public String getDescription(){
        return "basic coffee";
    }
    @Override
    public double cost(){
        return 5.0;
    }
}
