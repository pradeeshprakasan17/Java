interface Abc{
    void show();
}
public class LambdaExpression{
    public static void main(String[] args) {

        Abc n = () -> System.out.println("I'm the Best");

        n.show();
        
    }
}