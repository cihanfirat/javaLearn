import java.util.Scanner;

public class DatabaseManager {
    private IDatabase database;
    DatabaseManager(IDatabase database){
        this.database = database;
    }
    public void loginDatabase(){
        database.login();
    }
    public void addDatabase(){
        database.add();
    }
    public void deleteDatabase(){
        database.delete();
    }
    public void updateDatabase(){
        database.update();
    }
    public void getDatabase(){
        database.get();
    }

    public void selectMenu(){
        int choice;
        Scanner scanner = new Scanner(System.in);
        System.out.print(" ----- OPERTATIONS -----\n[1] - Add Data\n[2] - Delete Data\n[3] - Update Data\n[4] - Get Data\n-> Choose: ");
        choice = scanner.nextInt();
        switch(choice){
            case 1:
                System.out.println("------------------------");
                addDatabase();
                System.out.println("------------------------");
                break;
            case 2:
                System.out.println("------------------------");
                deleteDatabase();
                System.out.println("------------------------");
                break;
            case 3:
                System.out.println("------------------------");
                updateDatabase();
                System.out.println("------------------------");
                break;
            case 4:
                System.out.println("------------------------");
                getDatabase();
                System.out.println("------------------------");
                break;
            default:
                System.out.println("Invalid number!");
                break;
        }
    }
}
