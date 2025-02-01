public class digit {

    public static void main(String[] args) {
        int dig=  12345;
        int count = 0;
        

        while (dig != 0) {
            dig =dig / 10;
            count++;
            
            
        }
        System.out.println(count);
    }
    
}
