//functions made in the class are called methods
//by convention in java name of classes is started from capital letter
///and name of functions is started from small letters
class pen{//class keyword is used to make class
    String color;
    String type;

    public void write(){//this is method
        System.out.println("write something");
    }
    public void printcolor(){//this is method 
        System.out.println(this.color);//this keyword in java is used to tell that which object has called this function
    }

}
class Student{
    String name;
    int age;

    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    //simple constructor without parametres 
    //Student(){
    //     System.out.println("co nstructor called");
    // }

    //construcor with parameter 
    Student(String name,int age){
        this.name=name;
        this.age=age;
    }

}
public class oops {
    public static void main(String[]args){
        pen p1=new pen();//this is object of class
        p1.color="blue";
        p1.type="gel";
        pen p2=new pen();//this is object of class
        p2.color="black";
        p2.type="ballpoint";

        p1.printcolor();
        p2.printcolor();

        Student s1=new Student("paras",19);//new keyword is used to allocate memery in which object will be stored
        s1.name="Paras";
        s1.age=19;
        s1.printinfo();
        //CONSTRUCTORS IN JAVA ARE USED TO CONSTRUCT OBJECTS 
        
}
}
