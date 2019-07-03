// Author: Jack Collis
// GitHub: www.github.com/collis96/
// Portfolio: www.jackcprojects.co.uk

import java.io.*;
import java.util.*;

public class Solution {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scan.nextInt();

        for(int i=0 ; i<n ; i++){

            String str = scan.next();
            char[] ch = str.toCharArray();
            String even = "";
            String odd = "";

            for(int j=0 ; j<str.length() ; j++){
                if(j%2==0){ //even
                    even += ch[j];
                } else { //odd
                    odd += ch[j];
                }
            }

            System.out.println(even + " " + odd);

        }  
    }
}


