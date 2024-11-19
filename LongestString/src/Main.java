import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {



    public String LongestString(String str) {
        String ans = "";
        int maxLength = 0;


        StringTokenizer tokenizer = new StringTokenizer(str);  //by default \t
        while (tokenizer.hasMoreElements()) {
            String word = tokenizer.nextToken();
            if(word.length() > maxLength) {
                maxLength = word.length();
                ans = word;
            }
        }

        return ans;
    }



    /*
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

     */
    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();


        System.out.println(T.LongestString(str));
    }
}