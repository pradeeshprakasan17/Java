//Interface does not create Object 
//Java Does not support multiple inheritance BY using interface we achieve

interface Writer{
    //everything in interface is abstract method
    void write();
    //public abstract void show by default
}
//implements keyword in interface

/*we achieve Multiple Inheritance
class Pen extend Abc implements Writer{
    
}
*/
class Pen implements Writer{
    public void write(){
        System.out.println("Im Pen");
    }
}
class Pencil implements Writer{
    public void write(){
        System.out.println("Im Pencil");
    }
}
class Kit {
    public void doSome(Writer p){
        p.write();
    }
}
public class Interface{
    public static void main(String[] args) {

        Kit k = new Kit();

        Writer pen = new Pen();
        k.doSome(pen);
        Writer pc = new Pencil();
        k.doSome(pc);

        

    }
}