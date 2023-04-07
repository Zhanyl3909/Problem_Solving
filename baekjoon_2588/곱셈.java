import java.util.Scanner;

class Main{
    public static void main(String args[]) {
        Scanner myScan = new Scanner(System.in);
        
        int a = myScan.nextInt();
        int b = myScan.nextInt();
        int c = a * b;
        
        
       while (b > 0) {
       System.out.println( a * (b % 10));
       b = b / 10;
      }
        System.out.println(c);
    }
}
