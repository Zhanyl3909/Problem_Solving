import java.util.Scanner;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str; //var for String
        StringTokenizer sT; 
        
        int total = sc.nextInt();
        int i = 0;
        
        while(i<total) {
            str = sc.next();  //gets input like (1,4) as a String
            sT = new StringTokenizer(str, ",");
            
            int a = Integer.parseInt(sT.nextToken());
            int b = Integer.parseInt(sT.nextToken());
            
            System.out.println(a+b);
            i++;
        }
    }
}
