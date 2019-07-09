// Author: Jack Collis
// GitHub: www.github.com/collis96/
// Portfolio: www.jackcprojects.co.uk

import java.io.*;
import java.util.*;
import java.util.Collections;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        String emailPattern = ".+@gmail\\.com$";
        Pattern p = Pattern.compile(emailPattern);
        List<String> list = new ArrayList();

        for (int i = 0; i < num; i++){
            String name = scanner.next();
            String email = scanner.next();
            Matcher matcher = p.matcher(email);
            if (matcher.find()){
                list.add(name);
            }
        }

        Collections.sort(list); //sorting into alphabetical order
        for (String name : list){
            System.out.println(name);
        }

    }
}
