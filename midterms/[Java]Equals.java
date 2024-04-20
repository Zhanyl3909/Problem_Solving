

//difference between == and equals?
public class Main {
    public static void main(String[] args) {
       String str1 = "Programming";
       String str2 = "Programming";
       String str3 = new String("Programming");

       System.out.println(str1==str2);
       System.out.println(str1==str3);
       System.out.println(str1.equals(str3));
        System.out.println(str2.equals(str3));
        }
    }

    /*
    == is a reference comparison, i.e. both objects point to the same memory location
    .equals() evaluates to the comparison of values in the objects
     */
