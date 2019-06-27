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
    static int countingValleys(int n, String s) {

        /* Initialise variables */
        char[] arr = s.toCharArray();//Defines Space complexity
        int valleys = 0;
        int elevation = 0;
        boolean inValley = false;

        /* Cycle through array */
        for(int i=0;i<n;i++){ //Defines Time complexity

            if(arr[i]=='U'){ //Checking for Up or Down
                elevation++;
            } else { //'D'
                elevation--;
            }

            if(elevation==-1 && inValley==false){ //Increment valleys if entering Unique valley
                valleys++;
                inValley=true;
            }

            if(elevation==0){ //Reset inValley flag
                inValley=false;
            }

        }
        return valleys;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
