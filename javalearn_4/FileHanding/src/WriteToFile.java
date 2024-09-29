import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args){
        try{
            FileWriter myWriter = new FileWriter("filename.txt");
            myWriter.write("File content.");
            myWriter.close();// when you are done writing to the file, you should close it with the close() method
            System.out.println("Successfully wrote the file..");
        }catch(IOException e){
            System.out.println("ERROR");
            e.printStackTrace();
        }
    }
}
