
//            String temp = String.valueOf(s);
//            answer.add(temp);
//        }



import java.util.Scanner;

//reversing only char
// signs not reversed

public class Main {

    public static String reverseChar(String str) {
        char [] s = str.toCharArray();
        int left = 0;
        int right = str.length()-1;

        while (left < right) {
            if(!Character.isLetter(s[left])) {
                left++;   // if the left char is not a letter, move the left pointer
            } else if (!Character.isLetter(s[right])) {
                right--;
            }
            else {
                char tmp = s[left]; //if both characters are letters, swap
                s[left] = s[right];
                s[right] = tmp;

                left++;
                right--;
            }
        }
        return new String(s);
}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.next();
        System.out.println(reverseChar(str));

    }
}