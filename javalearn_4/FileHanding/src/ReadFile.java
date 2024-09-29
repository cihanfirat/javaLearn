import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;// Import the Scanner class to read text files


public class ReadFile {
    public static void main(String[] args){
        try{
            File myObj = new File("filename.txt");
            Scanner myReader = new Scanner(myObj); 
            // use the Scanner class to read the contents of the text file
            while(myReader.hasNextLine()){
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        }catch(FileNotFoundException e){
            System.out.println("ERROR");
            e.printStackTrace();
        }
    }
}
