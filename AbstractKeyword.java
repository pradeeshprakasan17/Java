//abstract class does not create object 
//abstract class only extends
//instead of using more method in sub class

abstract class Human{  //abstract class

    public abstract void eat();  //abstract method 
    //abstract method does not have body  

    public void walk(){

    }
}
class Man extends Human{
    public void eat(){

    }
}
public class AbstractKeyword {
    public static void main(String[] args) {
        
        Human obj = new Man();
    }
    
}
