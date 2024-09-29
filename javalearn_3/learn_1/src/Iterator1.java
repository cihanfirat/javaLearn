import java.util.ArrayList;
import java.util.Iterator;

public class Iterator1 {
    public static void main(String[] args){

        //make a collection
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("Hyundai");

        // get the iterator
        Iterator<String> it = cars.iterator();

        //print the first item
        System.out.println(it.next());

        //print through
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
