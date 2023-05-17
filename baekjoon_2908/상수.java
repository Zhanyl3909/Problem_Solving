import java.util.Scanner;
import java.lang.*;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();
        StringBuilder input1 = new StringBuilder();
        StringBuilder input2 = new StringBuilder();

        input1.append(s1);
        input1.reverse();

        input2.append(s2);
        input2.reverse();

        int a = Integer.parseInt(String.valueOf(input1));
        int b = Integer.parseInt(String.valueOf(input2));

                if(a > b) {
                    System.out.println(a);
                } else {
                    System.out.println(b);
                }

            }
        }






