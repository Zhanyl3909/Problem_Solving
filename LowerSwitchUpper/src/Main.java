import java.util.Scanner;

public class Main {

    public static String switchLowToUpp(String str) {

        String ans = "";

        for(int i=0; i<str.length(); i++) {
            char c = str.charAt(i);

            if(Character.isUpperCase(c)) {  //convert to lowercase
                c = Character.toLowerCase(c);
            } else {  //convert to uppercase
                c = Character.toUpperCase(c);
            }
            ans += c;
        }

        return ans;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.next();
        switchLowToUpp(str);
        System.out.println(switchLowToUpp(str));

    }
}
