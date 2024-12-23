public class Food implements IProduct{
    @Override
    public void accept(IVisitor visitor){
        visitor.foodVisit(this);
    }
}
