import java.util.Set;
import java.util.HashSet;

public class SetInterface {
    public static void main(String[] args) {
        
        Set<Integer> values = new HashSet<Integer>();

        values.add(8);
        values.add(10);
        values.add(12);
        values.add(4);
        values.add(6);
        values.add(8);
        values.add(10);
        values.add(12);

        for(int o : values){
            System.out.println(o);
        }
    }
    
}
