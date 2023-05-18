import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int max = 0;
      double sum = 0.0;

      for(int i=0; i<n; i++) {
        int l = sc.nextInt();
        if(max < l) max = l;
        sum += l;

      }
      double res = (sum/n)/max *100;

      System.out.println(res);
    }
}
