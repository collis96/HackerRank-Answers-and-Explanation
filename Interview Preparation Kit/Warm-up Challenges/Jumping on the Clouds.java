//Author: Jack Collis
//GitHub: www.github/collis96
//Portfolio: www.jackcprojects.co.uk

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    //Time complexity: O(n)
    //Space complexity: O(n)
    static int jumpingOnClouds(int[] c) {
        int size = c.length;
        int jumps = 0;

        /* Cycle through array */
        for(int i=0;i<size-1;i++){
            
            if(i==size-2){ //We need to break loop to avoid out of bounds exception
                jumps++;
                break;
            }

            if(c[i+2]==0){
                jumps++;
                i++;
            } else if(c[i+1]==0) {
                jumps++;
            }

        }

        return jumps;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = jumpingOnClouds(c);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
