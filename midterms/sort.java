
public class midterms {
    static void sort(int data[], int left, int right)
    {
        if(left < right) {
            int p = (left + right)/2;
            int tmp = data[0];
            data[0] = data[p];
            data[p] = tmp;
            sort(data,left,p-1);
            sort(data,p+1,right);
        }
    }

    public static void main(String[] args) {
        int key[] = {3, 7, 1, 8, 1};
        
        sort(key,0,4);
        for(int i = 0; i < 5; i++) {
            System.out.print(key[i] + " ");
        }
        System.out.println();
    }
}    

