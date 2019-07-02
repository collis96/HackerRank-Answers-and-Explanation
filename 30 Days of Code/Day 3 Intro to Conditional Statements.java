// Author: Jack Collis
// GitHub: www.github.com/collis96/
// Portfolio: www.jackcprojects.co.uk

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();
        weird(N);
    }

    public static void weird(int n){
        if(n%2!=0){ //odd
            System.out.print("Weird");
        }else{ //even
            if(n>1 && n<6){
                System.out.print("Not Weird");
            } else if (n>6 && n<21) {
                System.out.print("Weird");
            } else if (n>20) {
                System.out.print("Not Weird");
            } else {
                return;
            }
        }
    }
}
