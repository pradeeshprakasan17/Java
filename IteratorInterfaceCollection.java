
import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorInterfaceCollection{
    public static void main(String[] args) {
        
        Collection<Integer> values = new ArrayList<Integer>();
        values.add(5);
        values.add(6);
        values.add(7);
        values.add(8);

        System.out.println(values);

        Iterator it = values.iterator();

        System.out.println(it.next());
        System.out.println(it.next());

        System.out.println("Values");
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }

}