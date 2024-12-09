public class Main {
    public static void main(String[] args){

        //A factory is defined to create database connections. 
        //Each connection is assigned a unique ID.

        ObjectFactory<DatabaseConnection> connectionFactory =
         () -> new DatabaseConnection("Connection-"+System.nanoTime());
         
        //A database connection pool is created. The maximum pool size is set to 5.
        ObjectPool<DatabaseConnection> pool = new ObjectPool<>(5,connectionFactory);

        DatabaseConnection connection1 = pool.acquire();
        connection1.connect();

        connection1.disconnect();
        pool.release(connection1);

        DatabaseConnection connection2 = pool.acquire();
        connection2.connect();
    }
}
