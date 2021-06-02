/*
Final can be used with
Variable
Class
Method
*/
final class A{

    final DAY = 10;

    public final void show(){
        System.out.println("in a");
    }

    DAY = 15;
    //final variable cannot be changed
}
//final class cannot be changed
class B extends A{
    //final method cannot be override
    public void show(){

    }
}
public class FinalKeyword {
    public static void main(String[] args) {
        
        A a = new A();
    }
    
}
