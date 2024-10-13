import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        DatabaseManager databaseManager;
        int choice;
        Scanner scanner = new Scanner(System.in);
        System.out.println("---- INTERFACE / DATABASES --- \n");
        System.out.println("[1] - MySQL Database\n[2] - Oracle Database\n[3] - Mongo Database\n ->Choose: ");
        choice = scanner.nextInt();
        switch(choice){
            case 1:
                databaseManager = new DatabaseManager(new MysqlDatabase());
                System.out.println("-------------");
                databaseManager.loginDatabase();
                System.out.println("-------------");
                databaseManager.selectMenu();
                break;
            case 2:
                databaseManager = new DatabaseManager(new OracleDatabase());
                System.out.println("-------------");
                databaseManager.loginDatabase();
                System.out.println("-------------");
                databaseManager.selectMenu();
                break;
            case 3:
                databaseManager = new DatabaseManager(new MongoDatabase());
                System.out.println("-------------");
                databaseManager.loginDatabase();
                System.out.println("-------------");
                databaseManager.selectMenu();
                break;
        }
    }
}
