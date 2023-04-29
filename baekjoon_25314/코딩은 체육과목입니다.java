import java.util.*;;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String res = "";
        String last = "int";
        String sp = " ";

        if(n%4 == 0) {
            int tot = n/4;
            for(int i=0; i<tot; i++) {
                res += "long" + sp; 
            }
        }
        System.out.println(res + last) ;

    }

}
    

