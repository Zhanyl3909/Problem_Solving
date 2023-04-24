import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int total = scanner.nextInt();
        int count = scanner.nextInt();
        
        int sum = 0;
        
        for(int i=0; i<count; i++) {
            int num = scanner.nextInt();
            int time = scanner.nextInt();     
            sum = (sum + (num * time));
        }
        if(sum == total) System.out.println("Yes");
        else             System.out.println("No");
    }
}
