public class arraydemo {
    public static void main(String[]args){
        //declare
        int []arr=null;
        System.out.println(arr);

        //allocate space
        arr=new int[5];
        //by above line array will be allocating space in heap and arr will be allocated value of base address 
        System.out.println(arr);

        //getting
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        //set
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;

        //printing via loop
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        //enhanced for loop
        for(int val:arr){
            
            System.out.print(val);
        }

    }
    
}
