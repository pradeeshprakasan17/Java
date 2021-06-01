class VarArray{

    public int add(int ... i) //varargs  //acts as {1,2,3,4,5,6,7,8,9}
    {
        int sum = 0;
        for(int j : i){
            sum = sum + j;
        }
        return sum;
    }
}
public class Varargs {

    public static void main(String[] args) {

        VarArray arr = new VarArray();

        System.out.println(arr.add(1,2,3,4,5,6,7,8,9));
        
    }
    
}
