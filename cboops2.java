class person{
    private String name;
    private int age;
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int  getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
}
public class cboops2 {
    public static void main(String[]args){
        person p1=new person();
        person p2=new person();

        System.out.println(p1.getName());
        System.out.println(p1.getAge());

        p2.setName("PJ");
        p2.setAge(19);

        System.out.println(p2.getName());
        System.out.println(p2.getAge());
    }
    
}
