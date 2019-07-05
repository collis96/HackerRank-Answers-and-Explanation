// Author: Jack Collis
// GitHub: www.github.com/collis96/
// Portfolio: www.jackcprojects.co.uk

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int returnedDay = scan.nextInt();
        int returnedMonth = scan.nextInt();
        int returnedYear = scan.nextInt();
        int expectedDay = scan.nextInt();
        int expectedMonth = scan.nextInt();
        int expectedYear = scan.nextInt();
        scan.close();

        int fine = 0;

        if(returnedYear>expectedYear){
            fine = 10000;
        } else if(returnedYear == expectedYear && returnedMonth>expectedMonth){
            fine = 500 * (returnedMonth-expectedMonth);
        } else if(returnedYear == expectedYear && returnedMonth == expectedMonth && returnedDay>expectedDay){
            fine = 15 * (returnedDay-expectedDay);
        }

        System.out.print(fine);
    }
}
