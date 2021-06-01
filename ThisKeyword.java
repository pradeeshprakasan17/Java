class Calc{
    int num1; 

    //this refer to current object

    public Calc(int num1){
        this.num1 = num1;
    }

    /*public Calc(int num1){
        this.num1 = num1;              //output will num1 = 0;
    }*/
}
    public class ThisKeyword {
    
        public static void main(String args[]){
    
            Calc obj = new  Calc(5);
        }
    }


//output 
//5