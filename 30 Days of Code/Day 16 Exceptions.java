// Author: Jack Collis
// GitHub: www.github.com/collis96/
// Portfolio: www.jackcprojects.co.uk

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String S = in.next();

        try{
            System.out.print(Integer.parseInt(S));
        } catch (NumberFormatException e){
            System.out.print("Bad String");
        }

    }
}
