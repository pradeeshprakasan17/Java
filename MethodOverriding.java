class A{
    public void show(){
        System.out.println("in A");
    }
}
class B extends A{
    @Override                                //MethodOverRide
    public void show(){
        super.show();          //super to access parent class
        System.out.println("in B");
    }
}


public class MethodOverriding {
    public static void main(String[] args) {
        B b= new B();
        b.show();
    }
    
}
