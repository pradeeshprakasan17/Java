//single inheritance
class Calc{             //super, parent, base

    public int add(int i,int j){   //Calc have add method only
        return i+j;
    }
}

class AdvCalc extends Calc{   //sub, child, derived 

    public int sub(int i,int j){     //AdvCalc have add, sub methods
        return i-j;
    }
}
public class SingleInheritance {
    public static void main(String[] args) {

        AdvCalc cal = new AdvCalc();
        System.out.println(cal.add(4,5));
        System.out.println(cal.sub(6,5));
        
    }
    
}
