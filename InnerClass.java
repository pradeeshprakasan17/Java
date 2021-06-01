/*
Inner class
     Member Class
     Static class
     Anymonous Class
*/
class Outer {

    int a ;
    public void display(){
        System.out.println("in display");
    }

    class Inner{ //member class

        public  void show(){
            System.out.println("in show");
        }
    }

    static class Inner1{ //staic class

        public void show1(){
            System.out.println("in show1");

        }


    }


}

public class InnerClass {

    public static void main(String[] args) {
        
        Outer outer = new Outer();
        outer.display();

        //to access inner class
        Outer.Inner inner = outer.new Inner();
        //outer reference to new keyword
        inner.show();

        Outer.Inner1 inner1 = new Outer.Inner1();
        //does not reference outer object in static class
         inner1.show1(); 
    }
    
}
