class Calc{

    public Calc(int i,int j){
        System.out.println("ADD1 = "+(i+j));
    }

    //constructor overloading
    public Calc(int i,int j,int k){
        System.out.println("ADD2 = "+(i+j+k));

    }
    
    public Calc(double i,double j){
        System.out.println("ADD3 = "+(i+j));
    }
}

public class ConstructorOverloading{
    public static void main(String[] args) {
        
        Calc obj  = new Calc(4,5,10);
        
    }
}