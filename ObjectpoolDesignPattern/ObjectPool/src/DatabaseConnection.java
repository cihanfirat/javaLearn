//This class represents objects that will be stored and used in the repository. 
//In our example, it represents database connections.
public class DatabaseConnection {
    //It gives an ID to each connection. 
    //This is used to understand which connection is being used.
    private final String connectionId;
    
    public DatabaseConnection(String connectionId){
        this.connectionId=connectionId;
    }
    public void connect(){
        System.out.println("Connected to database with ID: " + connectionId);
    }
    public void disconnect(){
        System.out.println("Disconnected from database with ID: " + connectionId);
    }
}
