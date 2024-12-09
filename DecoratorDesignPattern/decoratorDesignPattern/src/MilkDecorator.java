public class MilkDecorator extends BeverageDecorator{
    public MilkDecorator(IBeverage beverage){
        super(beverage);
    }
    @Override
    public String getDescription(){
        return beverage.getDescription() + " ,Milk";
    }
    @Override
    public double cost(){
        return beverage.cost() + 1.5;
    }

}
