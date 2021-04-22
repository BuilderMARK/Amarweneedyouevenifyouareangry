import java.util.HashMap;
import java.util.Map;

public class GemMine {

    private static Map<String, GemMine> allInstances= new HashMap<>();

    private GemMine(String key) {
        //
    }

    public static GemMine getInstance(String key){
        GemMine instance= allInstances.get(key);
        if (instance== null)
        {
            instance = new GemMine (key);
            allInstances.put(key, instance);
        }
        return instance;
    }
    // ...}


}









 /*   public classMultiton{private staticMap<String, Multiton> allInstances= new HashMap<>();
    //...public staticMultiton getInstance(Stringkey){Multiton instance= allInstances.get(key);
        // if (instance== null){synchronized(allInstances){instance= allInstances.get(key);
        // if (instance== null){instance= new Multiton(key);allInstances.put(key, instance);}}}    returninstance;}}
*/