import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Comparator;
import java.util.*;

public class ComparatorInterfaceCollection{
    public static void main(String[] args) {
        
        //generic - <Integer>
        List<Integer> values = new ArrayList<Integer>();
        values.add(545);
        values.add(256);
        values.add(547);
        values.add(824);
        values.add(2,112);
        /*
        Comparator<Integer> c = new Comparator<Integer>()
                                {
                                    public int compare(Integer i,Integer j){
                                        return i%10 > j%10 ? 1 : -1;
                                    }

                                };*/



        Collections.sort(values,(i,j) -> i%10>j%10?1:-1);
        Iterator it = values.iterator();

        System.out.println("Values");
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }

}