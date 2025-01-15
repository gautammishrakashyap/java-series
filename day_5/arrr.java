import java.util.Scanner;
public class arrr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("print length");
        double len = scanner.nextDouble();

        System.out.println("print breadth");
        double bth = scanner.nextDouble();

        double area = len*bth;
        System.out.println(area);

        
    }
    
}
