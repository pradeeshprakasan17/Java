import javax.sound.midi.MidiChannel;

class A{
    public void show(){
        System.out.println("IN a");
    }
}
public class AnonymousClass {
    public static void main(String[] args) {
        
        A a = new A(){   //anonymous class
                        public void show(){
                            System.out.println("Im the Best");
                        }
                    };

        a.show();
    }    
}
