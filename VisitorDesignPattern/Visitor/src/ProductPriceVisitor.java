public class ProductPriceVisitor implements IVisitor{
    @Override
    public void electronicVisit(Electronic electronic){
        System.out.println("Electronic Product: Added Warranty");
    }
    @Override
    public void clothingVisit(Clothing clothing){
        System.out.println("Clothing Product: extra discount");
    }
    @Override
    public void foodVisit(Food food){
        System.out.println("Food Product: no tax");
    }
}
