public class App {
    public static void main(String[] args) throws Exception {
        IProduct electronic = new Electronic();
        IProduct clothing = new Clothing();
        IProduct food = new Food();
        IVisitor visitor = new ProductPriceVisitor();
        electronic.accept(visitor);
        clothing.accept(visitor);
        food.accept(visitor);
    }
}
