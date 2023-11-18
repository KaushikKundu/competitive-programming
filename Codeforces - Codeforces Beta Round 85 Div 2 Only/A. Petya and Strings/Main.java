//  A. Petya and Strings

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        a = a.toLowerCase();
        b = b.toLowerCase();
        for (int i = 0; i < a.length() ; i++) {
            int first = (int) a.charAt(i);

            int second = (int) b.charAt(i);
            
            if(first < second){
                System.out.println(-1);
                break;
            } else if (first > second) {
                System.out.println(1);
                break;
            } else if (i == a.length()-1 && first == second) {
                System.out.println(0);
            } else {
                continue;
            }
        }
        

    }
}