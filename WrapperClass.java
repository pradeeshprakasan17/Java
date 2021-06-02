//int , float, double
//Integer, Float , Double

import java.util.*;
public class WrapperClass {

    public static void main(String[] args) {
        
        int i = 5; //primitive datatype
        Integer ii = new Integer(5); //wrapper class

        Integer i2 = new Integer(i); //Boxing or wrapping

        int j = ii.intValue(); //unboxing or unwrapping

        Integer value = i   ;//autoboxing

        int value2 = ii ;// autounboxing

        String str = "123";

        int num = Integer.parseInt(str);

        System.out.println(num);




    }
    
}
