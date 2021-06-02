class A{
    public A(){
        System.out.println("In A");
    }
    public A(int i){
        System.out.println("In A int");
    }
}

class B extends A{
    public B(){
        super(6);             // super keyword - call the parent class method
        System.out.println("In B");
    }
    public B(int i){
        System.out.println("In B int");
    }
}

public class SuperKeyword {

   public static void main(String[] args) {
       
        B b = new B();
   }

    
}
