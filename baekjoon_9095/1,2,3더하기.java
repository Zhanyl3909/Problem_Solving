import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt(); //N
		
		int[] array = new int[11];
		
		array[0] = 0;
		array[1] = 1;
		array[2] = 2;
		array[3] = 4;
		

		int a = 0;
		for(int i = 0; i < num; i++) {
			a = sc.nextInt();         //N 만큼 user input 받는다
			for(int j = 4; j <= a; j++) {  //1,2,3만 쓸수 있어서 j=4
				array[j] = array[j - 1] + array[j - 2] + array[j - 3];
			}
			System.out.println(array[a]);
		}
	}

}
