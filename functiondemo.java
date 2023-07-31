import javax.sound.midi.Sequencer.SyncMode;

public class functiondemo {
    public static void main(String[]args){
        System.out.println("hello");
        //function call
        addition();
        System.out.println("bye");
    }
    //function definition
    public static void addition(){
        int a=10;
        int b=5;
        int c=a+b;
        System.out.println(c);
    }
    
}
