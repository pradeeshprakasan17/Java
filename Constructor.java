class Calc{
    int num1;

    //same as class name
    //does not have return type
    //will be automatically called when object is called
    //can be create how much memory for object

    public Calc(){ //default constructor 
        num1 = 5;
    }

    public Calc(int n){ //parameterized constructor
        num1 = n;
    }

    public Calc(double n){  //parameterized constructor
        num1 = n;
    }
}
public class Constructor {
    public static void main(String args[]){

        Calc obj = new  Calc(); //constructor
        
        //Calc obj = new Calc(5); 
        //Calc obj - new Calc(7.5);

        System.out.println(obj.num1);
        

                

    }
    
}
