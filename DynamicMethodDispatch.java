class A{
    public void show(){
        System.out.println("in A");
    }
}
class B extends A{                               
    public void show(){          
        System.out.println("in B");
    }
}
class C extends A{                               
    public void show(){          
        System.out.println("in C");
    }
    /*
    public void display(){
        System.out.println("In C Display");
    }
    */

}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        
        A obj = new B();  //runtime polymorphism
        obj.show();

        obj = new C();
        obj.show();

        //obj.display();  //it show error A class does not know about display method
    }
    
}
