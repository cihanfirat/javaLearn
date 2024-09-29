import java.io.File;
import java.io.IOException; //to handle errors

public class CreateFile {
    public static void main(String[] args) throws Exception {
        try{
            File myObj = new File("filename.txt");{
                if(myObj.createNewFile()){
                    System.out.println("File reated: " + myObj.getName());
                }else{
                    System.out.println("File Already Exists.");
                }
            }
        }catch(IOException e){
            System.out.println("An error occured.");
            e.printStackTrace();
        }
    }
}
