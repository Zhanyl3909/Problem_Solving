import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        
        StringTokenizer stoken = new StringTokenizer(str);
        
        int a = Integer.parseInt(stoken.nextToken());
        int b = Integer.parseInt(stoken.nextToken());
        int c = Integer.parseInt(stoken.nextToken());
        
        int first = (a+b)%c;
        int sec = ((a%c) + (b%c))%c;
        int third = (a*b)%c;
        int four = ((a%c) * (b%c))%c;
        
        System.out.println(first);
        System.out.println(sec);
        System.out.println(third);
        System.out.println(four);
        
    }
}

