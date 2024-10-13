public class MysqlDatabase implements IDatabase{
   public void login(){
    System.out.println("Logged in MySQL Database.");
   }
   public void add(){
    System.out.println("-> Added on MySQL database successfully.");
   }
   public void delete(){
    System.out.println("-> Deleted from MySQL database successfully.");
   }
   public void update(){
    System.out.println("-> MySQL Database updated successfully.");
   }
   public void get(){
    System.out.println("-> Got from MySQL database successfully.");
   }
}
