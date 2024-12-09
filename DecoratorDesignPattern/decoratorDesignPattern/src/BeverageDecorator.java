public abstract class BeverageDecorator implements IBeverage{
    protected IBeverage beverage;
    public BeverageDecorator(IBeverage beverage){
        this.beverage=beverage;
    }
    @Override
    public String getDescription(){
        return beverage.getDescription();
    }
    @Override
    public double cost(){
        return beverage.cost();
    }
}
