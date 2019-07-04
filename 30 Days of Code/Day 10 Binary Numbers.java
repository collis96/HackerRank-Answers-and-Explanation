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

    // input integer
    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();
        Deque<Integer> stack = new ArrayDeque<Integer>();
        int count = 0;
        int total = 0;

        /* Convert base 10 to base 2 and add to stack */
        while(n>0){
            int rem = n%2;
            n = n/2;
            stack.push(rem);
        }

        /* Read stack entries from head */
        while(stack.peek()!=null){
            if(stack.pop()==1){
                count++;
                if (count>=total){
                    total = count;
                }
            } else {
                count = 0;
            }
        }

        System.out.print(total);

    }
}

