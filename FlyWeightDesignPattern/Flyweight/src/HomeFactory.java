import java.util.HashMap;
import java.util.Map;

public class HomeFactory {

    private Map<String,IHome> pool = new HashMap<>();
    
    public IHome getHome(String homeType){
        IHome home = pool.get(homeType);
        if(home == null){
            home = new HomeConcereteFlyweight(homeType);
            pool.put(homeType, home);
        }return home;
    }
}
