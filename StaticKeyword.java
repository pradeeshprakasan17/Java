/*

Static is mainly used for memory management

static variables are same for all the object
non static variables are differrnt for all the object
cannot use non static variable in staic block
*/
class Student{

    int roll;
    String name;
    static String college;//static variable 
    // static variable share common memory 
    //stores variables class loaded memory 

    public Student(int roll, String name){ //executes when you create an object
        this.roll= roll; 
        this.name = name;
        //college = "Sri Eshwar";
    }
    public void show(){
        System.out.println(roll+" "+name + " " + college);
    }

    public static void display(){   //static methods
        System.out.println(college);
    }
}

public class StaticKeyword{

    static{  //static block  //executes when you load a class
        //college = "Sri Eshwar"; //executes only once
        System.out.println("in static");
    }

    public static void main(String[] args) {

    Student pradeesh = new Student(104,"Pradeesh"); 
    Student pradhi = new Student(105,"pradhi");

    //dont need object for static 
    Student.college = "Sri Eshwar";
    //use class name to access Static varible

    //pradeesh.college = "SRi"; changes static variable reflect all object

    pradeesh.show();
    pradhi.show();

    Student.display();//dont need a object for static method
    }

}

