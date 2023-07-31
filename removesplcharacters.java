public class removesplcharacters {
    public static void main(String[] args) {
        String str="$%paras^&j*ain";
        String result=str.replaceAll("[a-zA-Z0-9]", "");
        System.out.println(result);
    }
    
}
