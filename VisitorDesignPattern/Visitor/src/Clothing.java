public class Clothing implements IProduct{
    @Override
    public void accept(IVisitor visitor){
        visitor.clothingVisit(this);
    }
}
