// Author: Jack Collis
// GitHub: github.com/collis96
// Website: jackcprojects.co.uk

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        while(n --> 0){
            int N = scan.nextInt();
            System.out.println(isPrime(N) ? "Prime" : "Not prime");
        }
        scan.close();

    }

    public static boolean isPrime(int N){

        /* Accounting for even numbers */
        if(N<2){ //Less than 2 is not prime
            return false;
        } else if(N==2) {//account for '2' edge case even number
            return true;
        } else if(N%2==0){ //only need to iterate through odd numbers now
            return false;
        }

        /* Checking remaining odd numbers */
        int sqrt = (int) Math.sqrt(N);
        for(int i=3 ; i <= sqrt ; i+=2){//checking odd numbers up to square root
            if(N%i==0){
                return false;
            }
        }
        return true;
    }
}

/*
Explanation for square root of N: If a number N is NOT prime, it can be factored into
N = a * b, if both a and b are greater than the square root of N then a * b is greater than N. So we only have to check values up until the square root.
*/

