class Calc{
    int num1; //data members or attribute
    int num2;
    int result;
    public void perform(){ //behaviour or methods
        result = num1 + num2;
    } 
}
    public class Object {
    
        public static void main(String args[]){
    
            Calc obj = new  Calc(); //knows something and does something
    
            //obj - reference for object 
            //new - memory allocatio for object obj
            //Calc() - how much memory is allocated for constructor Calc()
            obj.num1 = 5;
            obj.num2 = 10;
            obj.perform();
    
            System.out.println(obj.num1);
            System.out.println(obj.num2);
            System.out.println(obj.result);
    
                    
    
        }
    }