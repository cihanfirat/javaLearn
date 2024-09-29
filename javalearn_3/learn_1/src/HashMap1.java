import java.util.HashMap;

public class HashMap1 {
    public static void main(String[] args){
        // Create a HashMap object called capitalCities
        HashMap<String,String> capitalCities = new HashMap<String,String>();

        // Add keys and values (Country, City)
        capitalCities.put("England","London");
        capitalCities.put("Turkey", "Istanbul");
        capitalCities.put("Norway" , "Oslo");
        System.out.println(capitalCities);

        System.out.println(capitalCities.get("England"));
        capitalCities.remove("England");
        System.out.println(capitalCities);
        System.out.println(capitalCities.size());

        for(String i : capitalCities.keySet()){
            System.out.println(i);
        }
        for(String i : capitalCities.values()){
            System.out.println(i);
        }
    }
}
