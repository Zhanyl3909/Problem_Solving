import java.util.Scanner;

public class Main {

    public String LongestString(String str) {
        String ans = "";
        int maxLength = 0;

        String [] words = str.split(" ");
        for(String word : words) {
           if(word.length() > maxLength) {
               maxLength = word.length();
               ans = word;
           }
        }


        return ans;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();


        System.out.println(T.LongestString(str));
    }
}