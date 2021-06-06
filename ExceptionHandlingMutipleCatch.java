public class ExceptionHandlingMutipleCatch {
    public static void main(String[] args) {
        try{
            
            int arr[] = new int[4];
            arr[6] = 8;
            int i = 9/0;
            System.out.println("Output");
        }
        catch (Exception e){
            System.out.println("It handle all exception");
        }
        catch(ArithmeticException e){
            System.out.println("Error");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error 2");
        }
        finally{
            System.out.println("Always Execute");
        }
    }
    
}

/* Output 
Error 2
Always Execute
*/