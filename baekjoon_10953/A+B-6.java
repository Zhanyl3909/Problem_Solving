import java.util.Scanner;
import java.util.StringTokenizer; //StringTokenizer의 역할은 
                                  //String에서 구분자를 통해서 토큰형태로 나눌 때 사용하는 클래스입니다

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str; 
        StringTokenizer sT;        //deceleration of StringTokenizer;
        
        int total = sc.nextInt(); 
        int i = 0;
        
        while(i<total) {
            str = sc.next();         //gets input like (1,4) as a String
            sT = new StringTokenizer(str, ",");  //string에서 , 표시를 token으로 지정한다
            
            int a = Integer.parseInt(sT.nextToken()); //다음 토큰을 불러오는 메서드
            int b = Integer.parseInt(sT.nextToken()); //parse into Integer
            
            System.out.println(a+b);
            i++;
        }
    }
}
