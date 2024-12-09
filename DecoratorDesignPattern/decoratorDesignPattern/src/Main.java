public class Main {
    public static void main(String[] args){
        IBeverage coffee = new Coffee();
        System.out.println(coffee.getDescription() + " $ " + coffee.cost());

        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getDescription() + " $ " + coffee.cost());

        coffee = new SugarDecorator(coffee);
        System.out.println(coffee.getDescription() + " $ " + coffee.cost());
    }
}
