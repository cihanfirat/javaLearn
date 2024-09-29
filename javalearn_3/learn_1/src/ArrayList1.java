import java.util.ArrayList;
import java.util.Collections;

public class ArrayList1 {
    public static void main(String[] args){
        ArrayList<String> cars = new ArrayList<String>(); //create ArrayList Object
        cars.add("Volvo"); // add items
        cars.add("Hyundai");
        System.out.println(cars);

        cars.add(0,"Mazda");
        System.out.println(cars);

        cars.set(0, "Opel"); //change item
        System.out.println(cars);

        cars.remove(0); // remove an item
        System.out.println(cars);
        System.out.println(cars.size()); //arraylist size

        cars.clear(); //remove all elements
        System.out.println(cars);

        cars.add("Volvo");
        cars.add("Hyundai");
        cars.add("Ford");
        cars.add("Opel");
        cars.add("Renault");
        for(String i : cars){
            System.out.println(i);
        }
        System.out.println("------------------");
        Collections.sort(cars); //sort arraylist
        for(String x : cars){
            System.out.println(x);
        }
        System.out.println("------------------");
        Collections.sort(cars,Collections.reverseOrder()); //sort reverse
        for(String i : cars){
            System.out.println(i);
        }
    }
}
