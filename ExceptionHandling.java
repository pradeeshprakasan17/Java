public class ExceptionHandling {
    public static void main(String[] args) {
        try{
            int i = 9/0;
            System.out.println("Output");
        }
        catch(Exception e){
            System.out.println("Error");
        }
        finally{
            System.out.println("Always Execute");
        }
    }
    
}

/* Output 
Error 
Always Execute
*/

