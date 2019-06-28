//Author: Jack Collis
//GitHub: www.github.com/collis96
//Portfolio: www.jackcprojects.co.uk

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    //Time complexity: O(N) where N = size
    //Space complexity: O(N)
    static long repeatedString(String s, long n) {

        /* Initialise variables */
        char[] input = s.toCharArray();
        long size = input.length;
        long count = 0;
        long rem = 0;

        /* Cycle through array */
        for(int i=0;i<input.length;i++){
            if(input[i]=='a'){ //How many 'a' chars in inital string
                count++;
            }
        }

        count *= n/size; //Multiply initial 'a' chars by occurrences of inital string
        rem = n%size; //If any chars remain then we must cycle through them and add to count
        
        /* Cycle through array (remainder) */
        for(int i=0;i<rem;i++){
            if(input[i]=='a'){
                count++;
            }
        }

        return count;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
