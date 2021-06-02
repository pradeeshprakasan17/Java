//Encapsulation ---> Binding data with methods
class Student{

    //make data as private and methods as public
    private int roll;
    private String name;

    //getter and setter
    public void set(int r,String n){
        roll = r;
        name = n;
    }

    public int getRoll(){
        return roll;
    }

    public String getName(){
        return name;
    }

}

public class Encapsulation{
    public static void main(String[] args) {
        Student s = new Student();
        s.set(105,"Pradhi");
        System.out.println(s.getRoll());
        System.out.println(s.getName());

    }
}