public class max {
    public static void main(String[] args) {
        int num1 = 22;
        int num2 = 54;
        int num3 = 33;
        if( num1 > num2 & num1 > num3){
            System.out.println(num1);
        }
        else if(num2 > num1 & num2 > num3){
            System.out.println(num2);
        }
        else{
            System.out.println(num3);
        }

        
    }
}