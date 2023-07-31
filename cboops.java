class person{
    String name;
    int age; 
}
public class cboops {
    public static void main(String[]args){
        person p1=new person();
        person p2=new person();

        System.out.println(p1.age);
        System.out.println(p1.name);

        p1.name="PARAS";
        p1.age=19;

        p2.name="JAIN";
        p2.age=20;
        System.out.println(p1.age);
        System.out.println(p1.name);
        System.out.println(p2.age);
        System.out.println(p2.name);
    }
    
}
