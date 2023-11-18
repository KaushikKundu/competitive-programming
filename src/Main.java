import java.util.Scanner;


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
        int first = 0;
        int second = 0;
        for (int i = 0; i < a.length() ; i++) {
            int value1 = (int) a.charAt(i);
            first += value1;
            int value2 = (int) b.charAt(i);
            second += value2;
        }
        if(first < second){
            System.out.println(-1);
        } else if (first > second) {
            System.out.println(1);
        }else {
            System.out.println(0);
        }
    }
}