


class DivSum {
    private int sum;

    public DivSum() { //Constructor
        sum = 0;
    }

    //method of DivSum class
    public void accSum(int num) {
        for (int i=1; i<10; i++) {
            if(num % i == 0) {
                sum+=i;
            }
        }
    }

    public int getSum() {
        return sum;
    }

}




public class Main {
    public static void main(String[] args) {

      int i = 10;
      DivSum ds = new DivSum();

      ds.accSum(i);
      int result = ds.getSum();
      System.out.println(i + " 보다 작은 약수의 합: " + result);

        }
    }
