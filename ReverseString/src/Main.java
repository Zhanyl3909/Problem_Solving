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
            System.out.println(reverseString(str));
        }
    }
}