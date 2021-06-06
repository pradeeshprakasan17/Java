import java.util.*;

public class MapInterface {
    public static void main(String[] args) {
        
        Map<String,String> values = new HashMap<String, String>();

        values.put("Actor","Allu");
        values.put("Food","CB");
        values.put("Color","Black");
        values.put("Lang","Tamil");
        values.put("Food","BB");

        for(Map.Entry k : values){
            System.out.println(k.getKey());
            System.out.println(k.getValue());
            
        }
    
    }
    
}
