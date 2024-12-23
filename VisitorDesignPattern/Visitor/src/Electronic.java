public class Electronic implements IProduct{
    @Override
    public void accept(IVisitor visitor){
        visitor.electronicVisit(this);
    }
}
