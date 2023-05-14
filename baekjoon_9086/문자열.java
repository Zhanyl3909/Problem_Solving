import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException
    {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int userIn = Integer.parseInt(br.readLine());
        
        for(int i=0; i<userIn; i++) {
            String str = br.readLine().trim();
            
             System.out.println(str.substring(0,1) + str.substring(str.length()-1, str.length()));
        }
       
    }
}
