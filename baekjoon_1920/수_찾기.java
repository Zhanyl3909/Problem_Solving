import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int usrInp = sc.nextInt();
        int[] myArr = new int[usrInp];

        for (int i = 0; i < usrInp; i++) {
            myArr[i] = sc.nextInt();
        }


        Arrays.sort(myArr);

        int M = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {

            if (binarySearch(myArr, sc.nextInt()) >= 0) {
                sb.append(1).append('\n');
            } else {
                sb.append(0).append('\n');
            }
        }
        System.out.println(sb);

    }



    public static int binarySearch(int[] arr, int key) {

        int low = 0;                    
        int hi = arr.length - 1;   

 
        while (low <= hi) {

            int mid = (low + hi) / 2;   

      
            if (key < arr[mid]) {
                hi = mid - 1;
            }
  
            else if (key > arr[mid]) {
                lo = mid + 1;
            }
        
            else {
                return mid;
            }
        }

        
        return -1;
    }
}
