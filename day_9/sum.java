public class sum {
    public static void main(String[] args) {
        int digit = 143;
        int suum =0;
        while (digit !=0) {
            suum += digit%10;
            digit = digit/10;

            
        }
        System.out.println(suum);
    }
    
}
