//  A. Vanya and Fence

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int w = n;
        while(n != 0){
            int a = sc.nextInt();
            n--;
            if(a > h)
                w++;
        }
        System.out.println(w);
    }
}