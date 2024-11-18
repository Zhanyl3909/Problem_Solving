import java.util.Scanner;


public class Main {

    public static int findTargetChar(String str, char t) {
        int answer = 0;

        String s = str.toLowerCase();
        char target = Character.toLowerCase(t);
        int len = s.length();

        for(int i = 0; i<len; i++ ) {
            if(s.charAt(i) == target) answer++;
        }

        return answer;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String input1 = in.next();   //user input string
        char input2 = in.next().charAt(0);  //target char


       int i = findTargetChar(input1, input2);
       System.out.println(i);
    }
}