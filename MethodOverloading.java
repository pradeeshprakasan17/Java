class Calc{

    public void add(int i,int j){
        System.out.println("ADD1 = "+(i+j));
    }

    //method overloading
    public void add(int i,int j,int k){
        System.out.println("ADD2 = "+(i+j+k));

    }
    
    public void add(double i,double j){
        System.out.println("ADD3 = "+(i+j));
    }
}

public class MethodOverloading{
    public static void main(String[] args) {
        
        Calc obj  = new Calc();
        obj.add(5,7);

        obj.add(5,7,5);

        obj.add(4.5,5.4);
        }
}