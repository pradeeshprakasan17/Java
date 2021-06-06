import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class ListInterfaceCollection{
    public static void main(String[] args) {
        
        //generic - <Integer>
        List<Integer> values = new ArrayList<Integer>();
        values.add(5);
        values.add(6);
        values.add(7);
        values.add(8);
        values.add(2,2);

        System.out.println(values);

        Iterator it = values.iterator();

        System.out.println(it.next());
        System.out.println(it.next());

        System.out.println("Values");
        while(it.hasNext()){
            System.out.println(it.next());
        }

        int len = values.size();

        System.out.println("Values in For ");
        for(int i=0;i<len;i++)
        {
            System.out.println(values.get(i));
        }

        for(int o : values){
            System.out.println(o);
        }

        

    }

}