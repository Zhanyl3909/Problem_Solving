import java.util.Scanner;

public class Main {


    public static String reverseString(String str) {

        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return  sb.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int line = in.nextInt();
        in.nextLine();

        for(int i=0; i<line; i++) {
            String str = in.nextLine();
        }
    }
}



/*
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static ArrayList<String> reverseChar(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();

        for(String x : str) {
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        String [] s = new String[n];

        for(int i=0; i<n; i++) {
            s[i] = in.next();
        }

        for(String x : reverseChar(n, s)) {
            System.out.println(x);
        }
    }
}
 */