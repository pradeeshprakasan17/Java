//Multi inheritance
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

class VeryAdvCalc extends AdvCalc{   

    public int multi(int i,int j){     //VeryAdvCalc have add, sub,multi methods
        return i*j;
    }
}


public class MultiInheritance {
    public static void main(String[] args) {

        VeryAdvCalc cal = new VeryAdvCalc();
        System.out.println(cal.add(4,5));
        System.out.println(cal.sub(6,5));
        System.out.println(cal.multi(5,5));
    }
    
}
