public class MongoDatabase implements IDatabase{
    public void login(){
        System.out.println("Logged in Mongo Database.");
       }
    public void add(){
        System.out.println("-> Added on Mongo database successfully.");
       }
    public void delete(){
        System.out.println("-> Deleted from Mongo database successfully.");
       }
    public void update(){
        System.out.println("-> Mongo Database updated successfully.");
       }
    public void get(){
        System.out.println("-> Got from Mongo database successfully.");
       }
}
